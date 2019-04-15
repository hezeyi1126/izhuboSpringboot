package springboot.hello.controller.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import springboot.hello.entity.SuUser;
import springboot.hello.entity.response.ResponseEntity;

public class BaseController {
	protected HttpServletRequest request;

	protected HttpServletResponse response;

	protected HttpSession session;
	
	
	
	
	/**
	 * 把request  response  session 注入controller
	 * @param request
	 * @param response
	 */
	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
		System.out.println("filter log~");
		this.request = request;

		this.response = response;

		this.session = request.getSession();

	}
	
	protected SuUser getUser() {
		return request.getSession().getAttribute("user") == null ? null : (SuUser)request.getSession().getAttribute("user");
	}
	
	protected boolean isLogin() {
		return request.getSession().getAttribute("user") == null ? false : true;
	}
	
	protected void write(String path) {
		File f = new File(path);
		if(!f.exists()) {
			return;
		}
		FileInputStream fis = null;
		OutputStream os =   null;
		try {
			 fis = new FileInputStream(f);
			 os =  response.getOutputStream();
			byte[] buffer = new byte[ 1024 * 2];
			int len = 0;
			while((len = fis.read(buffer)) != -1) {
				os.write(buffer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		byte[] buffer = new byte[ 1024 * 2];
		System.out.println(buffer.length);
		for(byte b : buffer) {
			System.out.print(b);
		}
	}
}
