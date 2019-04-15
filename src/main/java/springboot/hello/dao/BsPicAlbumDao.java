package springboot.hello.dao;

import springboot.hello.entity.BsPicAlbum;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsPicAlbumDao extends Mapper<BsPicAlbum>{

    int insert(BsPicAlbum bsPicAlbum);

    int delete(BsPicAlbum bsPicAlbum);

    int deleteByIds(@Param("ids") String[] ids);

    int update(BsPicAlbum bsPicAlbum);

    BsPicAlbum getById(@Param("id") String id);

    List<BsPicAlbum> list(BsPicAlbum bsPicAlbum);
}