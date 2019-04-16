package springboot.hello.controller;


import springboot.hello.service.BsAlbumService;
import springboot.hello.service.BsPicAlbumService;
import springboot.hello.service.BsPicsService;
import springboot.hello.service.BsTagService;
import springboot.hello.util.Dateutil;
import springboot.hello.util.ImgUtil;
import springboot.hello.util.LogUtil;
import springboot.hello.controller.base.BaseController;
import springboot.hello.entity.BsAlbum;
import springboot.hello.entity.BsPicAlbum;
import springboot.hello.entity.BsPics;
import springboot.hello.entity.BsTag;
import springboot.hello.entity.SuUser;
import springboot.hello.entity.TbUser;
import springboot.hello.entity.response.ResponseEntity;

import java.io.File;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.coobird.thumbnailator.Thumbnails;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Controller
@RequestMapping("/bsalbum")
@ConfigurationProperties(prefix = "params")
public class BsAlbumController extends BaseController{

    @Autowired
    BsAlbumService bsAlbumService;
    
    @Autowired
    BsPicsService bsPicsService;
    
    @Autowired
    BsPicAlbumService bsPicAlbumService;
    
    @Autowired
    BsTagService bsTagService;
    
  //文件上传路径
  	private String uploadPath;
  	
  	
  	public String getUploadPath() {
  		return uploadPath;
  	}


  	public void setUploadPath(String uploadPath) {
  		this.uploadPath = uploadPath;
  	}

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listBsAlbum(BsAlbum bsAlbum){
        PageHelper.startPage(bsAlbum.getPageNum(),bsAlbum.getPageSize());
        List<BsAlbum> list = bsAlbumService.list(bsAlbum);
        list.forEach((al)->{
        	al.setTagname(bsTagService.getById(al.getTagId() + "").getTagname());
        	
        } );
    	PageInfo<BsAlbum> pageInfo = new PageInfo<>(list);
    	
        return pageInfo;
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdBsAlbum(String id){
        return bsAlbumService.getById(id);
    }
    
    
    @RequestMapping(value="checkname",method = RequestMethod.POST)
    @ResponseBody
    public Object checkname(BsAlbum bsAlbum){
    	if(bsAlbumService.list(bsAlbum).size() == 0) {
    		  return ResponseEntity.code(1).msg("没有使用的相册名");
    	}
        return ResponseEntity.code(0).msg("相册有重名了,请修改相册名");
    }

    /**
     * 添加图片
     * @param bsAlbum 相册
     * @param picids 图片id字符串 ,分开
     * @param coverid 封面图片id
     * @param vipids vipid字符串 ,分开
     * @return
     */
    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBsAlbum( BsAlbum bsAlbum,String picids,String coverid ,String vipids){
    	//未登录
    			if(!isLogin()) {
    				return "x";
    			}
    	bsAlbum.setUploadTime(new Date());
    	bsAlbum.setUseFlag(0);
    	bsAlbum.setAlbumCoverId(Integer.parseInt(coverid));
    	bsAlbum.setUploadUser(getUser().getId());
    	//裁剪fengmian
    	String coverFile = uploadPath + bsPicsService.getById(coverid).getPath();
    	ImgUtil.cut(coverFile);
    	
    	
    	if(bsAlbumService.insert(bsAlbum) >0) {
    		bsAlbum.setUploadTime(null);
    		List<BsAlbum> list = bsAlbumService.list(bsAlbum);
    		bsAlbum = list.get(0);
    		
    		
    	}
    	if(picids != null) {
    		String[] ids = picids.split(",");
    		String[] vips = vipids.split(",");
    		for(int i =0 ; i < ids.length ;i++) {
    			BsPicAlbum picalb = new BsPicAlbum();
    			picalb.setAlbumId(bsAlbum.getId());
    			picalb.setPicId(Integer.parseInt(ids[i]));
    			bsPicAlbumService.insert(picalb);
    			//修改pic的cip属性
    			BsPics pic = bsPicsService.getById(ids[i]);
    			pic.setIsVip(Integer.parseInt(vips[i]));
    			pic.setAlbumId(bsAlbum.getId());
    			bsPicsService.update(pic);
    			
    		}
    	}
        return ResponseEntity.code(1).msg("添加相册成功");
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateBsAlbum(@RequestBody BsAlbum bsAlbum){
        return bsAlbumService.update(bsAlbum);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsAlbum(@RequestBody BsAlbum bsAlbum){
        return bsAlbumService.delete(bsAlbum);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsAlbumByIds(@RequestBody String[] ids){
        return bsAlbumService.deleteByIds(ids);
    }
}
