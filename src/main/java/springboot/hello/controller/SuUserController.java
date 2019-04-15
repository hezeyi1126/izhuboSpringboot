package springboot.hello.controller;


import springboot.hello.service.SuUserService;
import springboot.hello.controller.base.BaseController;
import springboot.hello.entity.SuUser;
import springboot.hello.entity.response.ResponseEntity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Controller
@RequestMapping("/suuser")
public class SuUserController extends BaseController{

    @Autowired
    SuUserService suUserService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listSuUser(){
        SuUser suUser=new SuUser();
        return suUserService.list(suUser);
    }
    @RequestMapping(value="logout",method = RequestMethod.GET)
    @ResponseBody
    public Object logout(){
    	request.getSession().removeAttribute("user");
    	return new SuUser();
    }
    
    @RequestMapping(value="login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(SuUser suUser){
    	List<SuUser> list = suUserService.list(suUser);
        if(list.size()  > 0) {
        	request.getSession().setAttribute("user", list.get(0));
        	return ResponseEntity.code(1).msg("登陆成功");
        }
        return ResponseEntity.code(0).msg("登陆失败");
    }
    
    @RequestMapping(value="myinfo",method = RequestMethod.POST)
    @ResponseBody
    public Object getMyInfo(SuUser suUser){
    	Object user = request.getSession().getAttribute("user");
        return user == null ? "0" : user;
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdSuUser(String id){
        return suUserService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertSuUser(@RequestBody SuUser suUser){
        return suUserService.insert(suUser);
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateSuUser(@RequestBody SuUser suUser){
        return suUserService.update(suUser);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSuUser(@RequestBody SuUser suUser){
        return suUserService.delete(suUser);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSuUserByIds(@RequestBody String[] ids){
        return suUserService.deleteByIds(ids);
    }
}
