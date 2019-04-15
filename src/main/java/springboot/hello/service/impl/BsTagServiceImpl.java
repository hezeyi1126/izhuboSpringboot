package springboot.hello.service.impl;

import springboot.hello.service.BsTagService;
import springboot.hello.dao.BsTagDao;
import springboot.hello.entity.BsTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
@Service
public class BsTagServiceImpl implements BsTagService {

    @Autowired
    private BsTagDao bsTagDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(BsTag bsTag){
        return bsTagDao.insert(bsTag);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(BsTag bsTag){
        return bsTagDao.delete(bsTag);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  bsTagDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(BsTag bsTag){
        return bsTagDao.update(bsTag);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public BsTag getById(String id){
        return bsTagDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<BsTag> list(BsTag bsTag){
        return bsTagDao.list(bsTag);
    }
    
    /**
    *getter and setter
    */
    public BsTagDao getBsTag(){
    	return this.bsTagDao;
    }
    
    public void setBsTagDao(BsTagDao bsTagDao){
      this.bsTagDao = bsTagDao;
    }
    

}