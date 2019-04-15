package springboot.hello.service.impl;

import springboot.hello.service.BsPicsService;
import springboot.hello.dao.BsPicAlbumDao;
import springboot.hello.dao.BsPicsDao;
import springboot.hello.entity.BsPics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
@Service
public class BsPicsServiceImpl implements BsPicsService {

    @Autowired
    private BsPicsDao bsPicsDao;

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(BsPics bsPics){
        return bsPicsDao.insert(bsPics);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(BsPics bsPics){
        return bsPicsDao.delete(bsPics);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByIds(String[] ids) {
        return  bsPicsDao.deleteByIds(ids);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(BsPics bsPics){
        return bsPicsDao.update(bsPics);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public BsPics getById(String id){
        return bsPicsDao.getById(id);
    }

    @Override
   // @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<BsPics> list(BsPics bsPics){
        return bsPicsDao.list(bsPics);
    }
    
    /**
    *getter and setter
    */
    public BsPicsDao getBsPics(){
    	return this.bsPicsDao;
    }
    
    public void setBsPicsDao(BsPicsDao bsPicsDao){
      this.bsPicsDao = bsPicsDao;
    }

	@Override
	public List<BsPics> queryPciAlbum(BsPics bsPics) {
		// TODO Auto-generated method stub
		return bsPicsDao.queryPciAlbum(bsPics);
	}
    

}