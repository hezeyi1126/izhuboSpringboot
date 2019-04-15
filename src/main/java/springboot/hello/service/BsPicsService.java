package springboot.hello.service;

import springboot.hello.entity.BsPics;
import java.util.List;

import org.apache.ibatis.annotations.Select;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface BsPicsService {

    int insert(BsPics bsPics);

    int delete(BsPics bsPics);

    int deleteByIds(String[] ids);

    int update(BsPics bsPics);

    BsPics getById(String id);
    
    
    List<BsPics> list(BsPics bsPics);
    
    
    List<BsPics> queryPciAlbum(BsPics bsPics);
}