package springboot.hello.dao;

import springboot.hello.entity.SuLog;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface SuLogDao extends Mapper<SuLog>{

    int insert(SuLog suLog);

    int delete(SuLog suLog);

    int deleteByIds(@Param("ids") String[] ids);

    int update(SuLog suLog);

    SuLog getById(@Param("id") String id);

    List<SuLog> list(SuLog suLog);
}