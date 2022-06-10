package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.frame.Util;
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
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, ProductVo obj) {
		// name, price, cid, mf(imgname을 끄집어 내고 파일은 static > img에 저장)
		// Constructor가 있으니 4개만으로 가능
		String imgname = obj.getMf().getOriginalFilename();
		obj.setImgname(imgname);
		
		try {
			biz.register(obj);
			Util.saveFile(obj.getMf());	// 파일 서버 저장
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVo> list = null;
		
		try {
			list = biz.get();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		m.addAttribute("center", "product/select");
		return "/index";
	}

}
