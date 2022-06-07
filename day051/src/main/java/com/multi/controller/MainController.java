package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

/**
 * @author noranbear
 * @date 2022. 6. 3.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 3.			noranbear			    First
 *
 * =========================================================
 */
@Controller
public class MainController {

	@Autowired
	CustBiz cbiz;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "login");
		// left가 없으면 left가 main.html에 의해 나올 것이다.
		return "main";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();	//login했다는 것을 서버에서 없앰
		}
		return "main";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		String next="";
		CustVo cust = null;
		try {
			cust = cbiz.get(id);
			if(cust != null) {
				if(cust.getPwd().equals(pwd)) {
					// login 성공
					// logincust에 cust의 객체 정보를 집어넣음으로써 
					// 로그인이 되었다라는 정보를 남겨놓을 수 있음
					session.setAttribute("logincust", cust);	
					m.addAttribute("logincust", cust);	// login 성공페이지 이름
					next = "loginok";
				}else {
					throw new Exception();
				}
				
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			next="loginfail";	// 서버 문제로 실패해도 fail
		}
		m.addAttribute("center", next);
		// left가 없으면 left가 main.html에 의해 나올 것이다.
		return next;
	}
}
