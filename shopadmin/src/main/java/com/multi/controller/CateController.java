package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVo;

/**
 * @author noranbear
 * @date 2022. 6. 9.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 9.			noranbear			    First
 *
 * =========================================================
 */
@Controller
@RequestMapping("/cate")
public class CateController {

	@Autowired
	CateBiz biz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "cate/add");
		return "/index";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(CateVo obj) {
		
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CateVo> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/select");
		
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		CateVo obj = null;
		
		try {
			obj = biz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(CateVo obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+obj.getId();
	}
}
