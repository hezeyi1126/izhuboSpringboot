package springboot.hello.controller;


import springboot.hello.service.BsPicsService;
import springboot.hello.util.LogUtil;
import springboot.hello.controller.base.BaseController;
import springboot.hello.entity.BsAlbum;
import springboot.hello.entity.BsPics;
import springboot.hello.entity.SuUser;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Controller
@RequestMapping("/bspics")
public class BsPicsController extends BaseController{

    @Autowired
    BsPicsService bsPicsService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listBsPics(BsPics bsPics){
        PageHelper.startPage(bsPics.getPageNum(),bsPics.getPageSize());
        SuUser user = getUser();
        List<BsPics> list = bsPicsService.list(bsPics);
        for(BsPics pic : list) {
        	//未登录 切浏览会员图片
        	if(user == null && pic.getIsVip() == 1) {
        		pic.setIsVip(2);
        	}
        }
    	PageInfo<BsPics> pageInfo = new PageInfo<>(list);
    	
    	//log
    	LogUtil.log("album",bsPics.getAlbumId() + "", request.getRemoteHost(), user == null ? 0 :user.getId() );
        return pageInfo;
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdBsPics(String id){
        return bsPicsService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBsPics(@RequestBody BsPics bsPics){
        return bsPicsService.insert(bsPics);
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateBsPics(@RequestBody BsPics bsPics){
        return bsPicsService.update(bsPics);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsPics(@RequestBody BsPics bsPics){
        return bsPicsService.delete(bsPics);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsPicsByIds(@RequestBody String[] ids){
        return bsPicsService.deleteByIds(ids);
    }
}
