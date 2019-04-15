package springboot.hello.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;

import springboot.hello.entity.SuUser;
import springboot.hello.service.SuUserService;
import springboot.hello.util.LogUtil;
import springboot.hello.util.SprtingUtil;

/**
 * 分页filter   预先处理一些参数
 * @author Administrator
 *
 */
@Order(1)
//过滤路径
@WebFilter(filterName="pageFilter",urlPatterns="/*")
public class PageFilter implements Filter{
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse reqponse = (HttpServletResponse)arg1;
		
//		System.out.println("arg0.getRemoteHost()-" +request.getRemoteHost());
//		System.out.println("arg0.getRemoteAddr()-" +request.getRemoteAddr());
//		System.out.println("arg0.getPathInfo()-" +request.getPathInfo());
//		System.out.println("arg0.getRequestURI()-" +request.getRequestURI());
//		System.out.println(SprtingUtil.getBean(SuUserService.class).list(new SuUser()).size());
//		SuUser user = request.getSession().getAttribute("user") == null ? null : (SuUser)request.getSession().getAttribute("user");
//		LogUtil.log("监督", request.getRequestURI(), request.getRemoteHost(), user == null ? 0 :user.getId() );
		
		//继续往下运行
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
