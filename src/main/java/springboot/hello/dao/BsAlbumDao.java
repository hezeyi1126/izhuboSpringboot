package springboot.hello.dao;

import springboot.hello.entity.BsAlbum;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsAlbumDao extends Mapper<BsAlbum>{

    int insert(BsAlbum bsAlbum);

    int delete(BsAlbum bsAlbum);

    int deleteByIds(@Param("ids") String[] ids);

    int update(BsAlbum bsAlbum);

    BsAlbum getById(@Param("id") String id);

    List<BsAlbum> list(BsAlbum bsAlbum);
}