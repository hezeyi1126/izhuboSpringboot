package springboot.hello.service.impl;

import springboot.hello.service.SuLogService;
import springboot.hello.dao.SuLogDao;
import springboot.hello.entity.SuLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Service
public class SuLogServiceImpl implements SuLogService {

    @Autowired
    private SuLogDao suLogDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(SuLog suLog){
        return suLogDao.insert(suLog);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(SuLog suLog){
        return suLogDao.delete(suLog);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  suLogDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(SuLog suLog){
        return suLogDao.update(suLog);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public SuLog getById(String id){
        return suLogDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<SuLog> list(SuLog suLog){
        return suLogDao.list(suLog);
    }
    
    /**
    *getter and setter
    */
    public SuLogDao getSuLog(){
    	return this.suLogDao;
    }
    
    public void setSuLogDao(SuLogDao suLogDao){
      this.suLogDao = suLogDao;
    }
    

}