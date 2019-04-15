package springboot.hello.dao;

import springboot.hello.entity.EsAlbumPic;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2018-12-27.
*/
public interface EsAlbumPicDao extends Mapper<EsAlbumPic>{

    int insert(EsAlbumPic esAlbumPic);

    int delete(EsAlbumPic esAlbumPic);

    int deleteByIds(@Param("ids") String[] ids);

    int update(EsAlbumPic esAlbumPic);

    EsAlbumPic getById(@Param("id") String id);

    List<EsAlbumPic> list(EsAlbumPic esAlbumPic);
}