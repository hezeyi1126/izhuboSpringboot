package springboot.hello.controller;


import springboot.hello.service.BsPicAlbumService;
import springboot.hello.entity.BsPicAlbum;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/** 
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Controller
@RequestMapping("/bspicalbum")
public class BsPicAlbumController{

    @Autowired
    BsPicAlbumService bsPicAlbumService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Object listBsPicAlbum(){
        BsPicAlbum bsPicAlbum=new BsPicAlbum();
        return bsPicAlbumService.list(bsPicAlbum);
    }

    @RequestMapping(value="getById.ztc",method = RequestMethod.GET)
    @ResponseBody
    public Object getByIdBsPicAlbum(String id){
        return bsPicAlbumService.getById(id);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBsPicAlbum(@RequestBody BsPicAlbum bsPicAlbum){
        return bsPicAlbumService.insert(bsPicAlbum);
    }


    @RequestMapping(value="",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateBsPicAlbum(@RequestBody BsPicAlbum bsPicAlbum){
        return bsPicAlbumService.update(bsPicAlbum);
    }


    @RequestMapping(value="",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsPicAlbum(@RequestBody BsPicAlbum bsPicAlbum){
        return bsPicAlbumService.delete(bsPicAlbum);
    }

    @RequestMapping(value="/selective",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteBsPicAlbumByIds(@RequestBody String[] ids){
        return bsPicAlbumService.deleteByIds(ids);
    }
}
