package springboot.hello.service;

import springboot.hello.entity.SuLog;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface SuLogService {

    int insert(SuLog suLog);

    int delete(SuLog suLog);

    int deleteByIds(String[] ids);

    int update(SuLog suLog);

    SuLog getById(String id);

    List<SuLog> list(SuLog suLog);
    
}