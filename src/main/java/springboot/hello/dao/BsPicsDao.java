package springboot.hello.dao;

import springboot.hello.entity.BsPics;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsPicsDao extends Mapper<BsPics>{

    int insert(BsPics bsPics);

    int delete(BsPics bsPics);

    int deleteByIds(@Param("ids") String[] ids);

    int update(BsPics bsPics);

    BsPics getById(@Param("id") String id);

  
    List<BsPics> list(BsPics bsPics);
    
    
    @Select("select a.id ,b.album_id , a.path ,a.is_vip \n" + 
    		"from bs_pics a \n" + 
    		"join bs_pic_album b on a.id = b.pic_id where b.album_id = #{albumId}")
    List<BsPics> queryPciAlbum(BsPics bsPics);
    
    
    @Select("select id ,album_id , path ,is_vip \n" + 
    		"from bs_pics " + 
    		"where is_vip is null")
    List<BsPics> queryVipNull(BsPics bsPics);
}