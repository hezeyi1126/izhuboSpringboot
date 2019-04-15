package springboot.hello.service;

import springboot.hello.entity.BsPicAlbum;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsPicAlbumService {

    int insert(BsPicAlbum bsPicAlbum);

    int delete(BsPicAlbum bsPicAlbum);

    int deleteByIds(String[] ids);

    int update(BsPicAlbum bsPicAlbum);

    BsPicAlbum getById(String id);

    List<BsPicAlbum> list(BsPicAlbum bsPicAlbum);
    
}