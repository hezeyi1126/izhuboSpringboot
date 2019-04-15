package springboot.hello.util;

import java.util.Date;

import springboot.hello.entity.SuLog;
import springboot.hello.service.SuLogService;

public class LogUtil {
	
	
	
	public static void log(String logType , String accPath, String remoteip ,int userid) {
		SuLog log = new SuLog();
		log.setLogType(logType);
		log.setAccessPath(accPath);
		log.setRemoteIp(remoteip);
		log.setUserId(userid);
		log.setCreateTime(new Date());
		SprtingUtil.getBean(SuLogService.class).insert(log)	;	
	}
}
