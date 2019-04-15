package springboot.hello.controller;


import springboot.hello.service.EsAlbumPicService;
import springboot.hello.entity.EsAlbumPic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/** 
* Created by hbm Generator<27683139@qq.com> on 2018-12-27.
*/
@Controller
@RequestMapping("/esalbumpic")
public class EsAlbumPicController{

    @Autowired
    EsAlbumPicService esAlbumPicService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listEsAlbumPic(){
        EsAlbumPic esAlbumPic=new EsAlbumPic();
        return esAlbumPicService.list(esAlbumPic);
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdEsAlbumPic(String id){
        return esAlbumPicService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertEsAlbumPic(@RequestBody EsAlbumPic esAlbumPic){
        return esAlbumPicService.insert(esAlbumPic);
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateEsAlbumPic(@RequestBody EsAlbumPic esAlbumPic){
        return esAlbumPicService.update(esAlbumPic);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteEsAlbumPic(@RequestBody EsAlbumPic esAlbumPic){
        return esAlbumPicService.delete(esAlbumPic);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteEsAlbumPicByIds(@RequestBody String[] ids){
        return esAlbumPicService.deleteByIds(ids);
    }
}
