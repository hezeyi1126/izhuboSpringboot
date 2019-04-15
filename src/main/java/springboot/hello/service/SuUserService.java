package springboot.hello.service;

import springboot.hello.entity.SuUser;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface SuUserService {

    int insert(SuUser suUser);

    int delete(SuUser suUser);

    int deleteByIds(String[] ids);

    int update(SuUser suUser);

    SuUser getById(String id);

    List<SuUser> list(SuUser suUser);
    
}