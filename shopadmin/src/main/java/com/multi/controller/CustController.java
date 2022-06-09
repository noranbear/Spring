package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

/**
 * @author noranbear
 * @date 2022. 6. 8.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 8.			noranbear			    First
 *
 * =========================================================
 */
@Controller
@RequestMapping("/cust")
public class CustController {

	@Autowired
	CustBiz biz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "cust/add");
		return "index";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CustVo obj) {
		try {
			biz.register(obj);
			//obj = biz.get(obj.getId());
			//m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//m.addAttribute("center", "cust/detail");
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CustVo> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// center page 바꿔주기
		m.addAttribute("center", "cust/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, String id) {
		CustVo obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cust/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CustVo obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
	}
}
