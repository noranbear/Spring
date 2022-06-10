package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CateVo;
import com.multi.vo.ProductVo;

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
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@Autowired
	CateBiz ctbiz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVo> list = null;
		try {
			list = ctbiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		m.addAttribute("center", "product/add");
		return "/index";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVo> list = null;
		
		try {
			list = biz.get();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m.addAttribute("center", "product/select");
		return "/index";
	}
	

}
