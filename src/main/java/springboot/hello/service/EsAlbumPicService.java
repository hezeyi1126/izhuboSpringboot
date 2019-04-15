package springboot.hello.service;

import springboot.hello.entity.EsAlbumPic;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2018-12-27.
*/
public interface EsAlbumPicService {

    int insert(EsAlbumPic esAlbumPic);

    int delete(EsAlbumPic esAlbumPic);

    int deleteByIds(String[] ids);

    int update(EsAlbumPic esAlbumPic);

    EsAlbumPic getById(String id);

    List<EsAlbumPic> list(EsAlbumPic esAlbumPic);
    
}