package springboot.hello.controller;


import springboot.hello.service.SuLogService;
import springboot.hello.entity.SuLog;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Controller
@RequestMapping("/sulog")
public class SuLogController{

    @Autowired
    SuLogService suLogService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listSuLog(){
        SuLog suLog=new SuLog();
        return suLogService.list(suLog);
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdSuLog(String id){
        return suLogService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertSuLog(@RequestBody SuLog suLog){
        return suLogService.insert(suLog);
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateSuLog(@RequestBody SuLog suLog){
        return suLogService.update(suLog);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSuLog(@RequestBody SuLog suLog){
        return suLogService.delete(suLog);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteSuLogByIds(@RequestBody String[] ids){
        return suLogService.deleteByIds(ids);
    }
}
