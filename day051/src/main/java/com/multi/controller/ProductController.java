package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

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
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		mv.addObject("center","product/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("left","product/left");
		m.addAttribute("center","product/register");
		return "main";
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, ProductVo obj) {
		mv.setViewName("main");
		mv.addObject("left","product/left");
		try {
			biz.register(obj);
			int cnt = biz.getcnt();
			mv.addObject("cnt", cnt);
			mv.addObject("center","product/registerok");
		} catch (Exception e) {
			mv.addObject("center","product/registerfail");
		}

		return mv;
	}
	
}
