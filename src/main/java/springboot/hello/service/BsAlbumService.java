package springboot.hello.service;

import springboot.hello.entity.BsAlbum;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsAlbumService {

    int insert(BsAlbum bsAlbum);

    int delete(BsAlbum bsAlbum);

    int deleteByIds(String[] ids);

    int update(BsAlbum bsAlbum);

    BsAlbum getById(String id);

    List<BsAlbum> list(BsAlbum bsAlbum);
    
}