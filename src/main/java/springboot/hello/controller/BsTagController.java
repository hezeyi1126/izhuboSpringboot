package springboot.hello.controller;


import springboot.hello.service.BsTagService;
import springboot.hello.entity.BsTag;
import springboot.hello.entity.response.ResponseEntity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
@Controller
@RequestMapping("/bstag")
public class BsTagController{

    @Autowired
    BsTagService bsTagService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listBsTag(){
        BsTag bsTag=new BsTag();
        return bsTagService.list(bsTag);
    }
    
    @RequestMapping(value="checkname",method = RequestMethod.GET)
    @ResponseBody
    public Object checkname( BsTag bsTag){
        if(bsTagService.list(bsTag).size() > 0) {
        	return ResponseEntity.code(0).msg("重复种类失败");
        }
        
        return ResponseEntity.code(1);
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdBsTag(String id){
        return bsTagService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBsTag(BsTag bsTag){
    	if( bsTagService.insert(bsTag) > 0) {
    		return ResponseEntity.code(1).msg("添加种类成功");
    	}
    	
        return ResponseEntity.code(0).msg("添加种类失败");
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateBsTag(@RequestBody BsTag bsTag){
        return bsTagService.update(bsTag);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsTag(@RequestBody BsTag bsTag){
        return bsTagService.delete(bsTag);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsTagByIds(@RequestBody String[] ids){
        return bsTagService.deleteByIds(ids);
    }
}
