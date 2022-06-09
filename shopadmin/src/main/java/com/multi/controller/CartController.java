package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVo;

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
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartBiz biz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		
		m.addAttribute("center", "cart/add");
		return "/index";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CartVo obj) {
		
		try {
			biz.register(obj);
			obj = biz.get(obj.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CartVo> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cart/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		CartVo obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("c", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center","cart/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(CartVo obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
	}
}
