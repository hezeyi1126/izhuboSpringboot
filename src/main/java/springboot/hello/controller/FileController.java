package springboot.hello.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import springboot.hello.controller.base.BaseController;
import springboot.hello.dao.BsPicsDao;
import springboot.hello.entity.BsPics;
import springboot.hello.entity.response.ResponseEntity;
import springboot.hello.service.BsPicsService;
import springboot.hello.util.FileUtil;
import springboot.hello.util.UUIDutil;

@Scope("prototype")
@Controller
@RequestMapping("/")
@ConfigurationProperties(prefix = "params")
public class FileController extends BaseController{
	
	@Autowired
	private BsPicsService bsPicsService;
	
	@Autowired
	private BsPicsDao bsPicsDao;
	
	//文件上传路径
	private String uploadPath;
	
	
	public String getUploadPath() {
		return uploadPath;
	}


	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	
	

	@RequestMapping(value="pic")
	public void getPic(String id) {
		
		
		BsPics pic = bsPicsService.getById(id);
		
		
		if(pic == null) {
			return;
		}
		if(request.getSession().getAttribute("user") == null && pic.getIsVip() == 1) {
			return;
		}
		String path = uploadPath + pic.getPath();
		write(path);
	}
	
	/**
	 * 删除没有vip信息的文件
	 * @param id
	 */
	@RequestMapping(value="delfile")
	public void delf(String id) {
		
		
		List<BsPics> pic = bsPicsDao.queryVipNull(null);
		int len = pic.size();
		File parent = null;
		for(int i = 0; i < pic.size() ;i++) {
			BsPics p = pic.get(i);
			File f = new File(uploadPath + p.getPath());
			if(f.exists()) {
				if( i == len - 1) {
					parent = f.getParentFile();
				
				}
				
				if(f.delete()) {
					if(parent != null) {
						parent.delete();
					}
					bsPicsDao.delete(p);
				}
			}
			f = null;
			
		}
		
		
		
	}
	
	
	@RequestMapping(value="upload", method = RequestMethod.POST)
	@ResponseBody
	public Object upload(@RequestParam("file")MultipartFile file, HttpServletRequest request) {
		//未登录
		if(!isLogin()) {
			return ResponseEntity.code(8).msg("请登陆");
		}
		 String contentType = file.getContentType();
	     String fileName = file.getOriginalFilename();
	     String uuid = UUIDutil.uuid();
	     String location = uuid + getImgType(contentType);
	     String uploadedname = null;
	     List<String> filenames = null;
	     try {
	    	 uploadedname = FileUtil.uploadFile(file.getBytes(), uploadPath, location);
	    	
	            //如果是压缩文件
		   	     if(location.indexOf(".zip") > 0) {
		   	    	 File f = new File(uploadedname);
		   	    	 if(f.exists()) {
		   	    		filenames = FileUtil.unzip(f, uploadPath  + uuid + "/");
		   	    		//删除zip文件
		   	    		
		   	    		if(f.exists()) {
		   	    			System.out.println(f.delete());
		   	    			
		   	    		}
		   	    	 }
		   	     }else {
		   	    	 //压缩图片大小
			    	 File imguploaded = new File(uploadedname);
			    	 if(imguploaded.exists() && imguploaded.isFile()) {
			    		 Thumbnails.of(imguploaded)
							.scale(1f).outputQuality(0.4f)
							.toFile(imguploaded);
			    	 }
		   	     }
	        } catch (Exception e) {
	            // TODO: handle exception
	        	e.printStackTrace();
	        	 return "0";
	        }
	    
//	     写入数据库
	     List<BsPics> piclist = new ArrayList<>();
	     if(location.indexOf(".zip") > 0) {
	    	
	    	 for(String filename : filenames) {
	    		 BsPics pic = new BsPics();
			     pic.setAlbumId(5);
			     pic.setPath(uuid + "/" + filename);
			     if( bsPicsService.insert(pic) > 0) {
			    	  pic = bsPicsService.list(pic).get(0);
			    	  piclist.add(pic);
			     }
			     
	    	 }
	     }else {
	    	 BsPics pic = new BsPics();
		     pic.setAlbumId(5);
		     pic.setPath(location);
		     if( bsPicsService.insert(pic) > 0) {
		    	  pic = bsPicsService.list(pic).get(0);
		    	  piclist.add(pic);
		     }
		    
	     }
	     return ResponseEntity.code(1).msg("上传成功").result(piclist);
	     
	}
	
	private String getImgType(String type) {
		if(type.indexOf("jpeg") > 0) {
			return ".jpg";
		}else if(type.indexOf("png") > 0) {
			return ".png";
		}else if(type.indexOf("gif") > 0) {
			return ".gif";
		}else if(type.indexOf("zip-compressed") > 0) {
			return ".zip";
		}
		
		return "x";
	}	
}
