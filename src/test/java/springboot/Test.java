package springboot;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.hello.Application;
import springboot.hello.entity.BsAlbum;
import springboot.hello.entity.TbUser;
import springboot.hello.service.BsAlbumService;
import springboot.hello.service.TbUserService;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class Test {

//	@Autowired
//    ApplicationContext applicationContext;
	
	@Before
	public void before() {
//		System.out.println("before");
	}
	
	@org.junit.Test
	public void test() {
//		System.out.println(getBean(TbUserService.class).list(new TbUser()).size());
//		BsAlbum al = new BsAlbum();
//		getBean(BsAlbumService.class).insert(al);
	}
	
	@After
	public void after() {
//		System.out.println("after");
	}
	
//	public <T> T getBean(Class<T> clazz) {
//		
//		return applicationContext.getBean(clazz);
//	}
}
