package springboot.hello.util;

import java.util.UUID;

public class UUIDutil {
	public static String uuid() {
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString());
		
	}	
}
