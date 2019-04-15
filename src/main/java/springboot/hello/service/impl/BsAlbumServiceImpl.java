package springboot.hello.service.impl;

import springboot.hello.service.BsAlbumService;
import springboot.hello.dao.BsAlbumDao;
import springboot.hello.entity.BsAlbum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Service
public class BsAlbumServiceImpl implements BsAlbumService {

    @Autowired
    private BsAlbumDao bsAlbumDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(BsAlbum bsAlbum){
        return bsAlbumDao.insert(bsAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(BsAlbum bsAlbum){
        return bsAlbumDao.delete(bsAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  bsAlbumDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(BsAlbum bsAlbum){
        return bsAlbumDao.update(bsAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public BsAlbum getById(String id){
        return bsAlbumDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<BsAlbum> list(BsAlbum bsAlbum){
        return bsAlbumDao.list(bsAlbum);
    }
    
    /**
    *getter and setter
    */
    public BsAlbumDao getBsAlbum(){
    	return this.bsAlbumDao;
    }
    
    public void setBsAlbumDao(BsAlbumDao bsAlbumDao){
      this.bsAlbumDao = bsAlbumDao;
    }
    

}