package springboot.hello.service;

import springboot.hello.entity.BsTag;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
public interface BsTagService {

    int insert(BsTag bsTag);

    int delete(BsTag bsTag);

    int deleteByIds(String[] ids);

    int update(BsTag bsTag);

    BsTag getById(String id);

    List<BsTag> list(BsTag bsTag);
    
}