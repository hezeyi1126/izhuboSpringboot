package springboot.hello.service.impl;

import springboot.hello.service.EsAlbumPicService;
import springboot.hello.dao.EsAlbumPicDao;
import springboot.hello.entity.EsAlbumPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2018-12-27.
*/
@Service
public class EsAlbumPicServiceImpl implements EsAlbumPicService {

    @Autowired
    private EsAlbumPicDao esAlbumPicDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(EsAlbumPic esAlbumPic){
        return esAlbumPicDao.insert(esAlbumPic);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(EsAlbumPic esAlbumPic){
        return esAlbumPicDao.delete(esAlbumPic);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  esAlbumPicDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(EsAlbumPic esAlbumPic){
        return esAlbumPicDao.update(esAlbumPic);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public EsAlbumPic getById(String id){
        return esAlbumPicDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<EsAlbumPic> list(EsAlbumPic esAlbumPic){
        return esAlbumPicDao.list(esAlbumPic);
    }
    
    /**
    *getter and setter
    */
    public EsAlbumPicDao getEsAlbumPic(){
    	return this.esAlbumPicDao;
    }
    
    public void setEsAlbumPicDao(EsAlbumPicDao esAlbumPicDao){
      this.esAlbumPicDao = esAlbumPicDao;
    }
    

}