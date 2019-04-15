package springboot.hello.service.impl;

import springboot.hello.service.BsPicAlbumService;
import springboot.hello.dao.BsPicAlbumDao;
import springboot.hello.entity.BsPicAlbum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Service
public class BsPicAlbumServiceImpl implements BsPicAlbumService {

    @Autowired
    private BsPicAlbumDao bsPicAlbumDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(BsPicAlbum bsPicAlbum){
        return bsPicAlbumDao.insert(bsPicAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(BsPicAlbum bsPicAlbum){
        return bsPicAlbumDao.delete(bsPicAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  bsPicAlbumDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(BsPicAlbum bsPicAlbum){
        return bsPicAlbumDao.update(bsPicAlbum);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public BsPicAlbum getById(String id){
        return bsPicAlbumDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<BsPicAlbum> list(BsPicAlbum bsPicAlbum){
        return bsPicAlbumDao.list(bsPicAlbum);
    }
    
    /**
    *getter and setter
    */
    public BsPicAlbumDao getBsPicAlbum(){
    	return this.bsPicAlbumDao;
    }
    
    public void setBsPicAlbumDao(BsPicAlbumDao bsPicAlbumDao){
      this.bsPicAlbumDao = bsPicAlbumDao;
    }
    

}