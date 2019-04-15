package springboot.hello.dao;

import springboot.hello.entity.SuUser;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public interface SuUserDao extends Mapper<SuUser>{

    int insert(SuUser suUser);

    int delete(SuUser suUser);

    int deleteByIds(@Param("ids") String[] ids);

    int update(SuUser suUser);

    SuUser getById(@Param("id") String id);

    List<SuUser> list(SuUser suUser);
}