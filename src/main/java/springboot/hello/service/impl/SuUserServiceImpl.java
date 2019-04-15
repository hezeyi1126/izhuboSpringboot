package springboot.hello.service.impl;

import springboot.hello.service.SuUserService;
import springboot.hello.dao.SuUserDao;
import springboot.hello.entity.SuUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Service
public class SuUserServiceImpl implements SuUserService {

    @Autowired
    private SuUserDao suUserDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(SuUser suUser){
        return suUserDao.insert(suUser);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(SuUser suUser){
        return suUserDao.delete(suUser);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  suUserDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(SuUser suUser){
        return suUserDao.update(suUser);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public SuUser getById(String id){
        return suUserDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<SuUser> list(SuUser suUser){
        return suUserDao.list(suUser);
    }
    
    /**
    *getter and setter
    */
    public SuUserDao getSuUser(){
    	return this.suUserDao;
    }
    
    public void setSuUserDao(SuUserDao suUserDao){
      this.suUserDao = suUserDao;
    }
    

}