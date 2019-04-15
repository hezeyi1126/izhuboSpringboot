package springboot.hello.dao;

import springboot.hello.entity.BsTag;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
public interface BsTagDao extends Mapper<BsTag>{

    int insert(BsTag bsTag);

    int delete(BsTag bsTag);

    int deleteByIds(@Param("ids") String[] ids);

    int update(BsTag bsTag);

    BsTag getById(@Param("id") String id);

    List<BsTag> list(BsTag bsTag);
}