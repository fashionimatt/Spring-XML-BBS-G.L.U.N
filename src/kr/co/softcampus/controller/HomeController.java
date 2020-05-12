package kr.co.softcampus.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.softcampus.beans.UserBean;

@Controller
public class HomeController {
	
	// SessionScope로 등록한 Bean은 브라우저가 최초에 요청을 발생시키는 시점이다.
	// Java 프로젝트는 최초에 요청이 발생할 때 주입 시도를 하는데, XML 프로젝트는 서버를 가동할 때 주입 시도를 한다.
	// 그래서 @Lazy를 넣지 않으면 오류가 발생한다.
//	@Resource(name = "loginUserBean")
//	@Lazy
//	private UserBean loginUserBean;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
//		System.out.println(loginUserBean);
		
		return "redirect:/main";
	}
}
