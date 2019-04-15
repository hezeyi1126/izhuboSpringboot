package springboot.hello.util;

import org.springframework.context.ApplicationContext;

public class SprtingUtil {
	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		SprtingUtil.applicationContext = applicationContext;
	}
	
	
	public ApplicationContext getCtx() {
		return applicationContext;
	}
	
	public static <T> T getBean(Class<T> t) {
		return applicationContext.getBean(t);
	}
	

}
