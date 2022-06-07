package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/register");
		return mv;
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, CustVo obj) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.register(obj);
			mv.addObject("center","cust/registerok");
			mv.addObject("rcust",obj);
		} catch (Exception e) {
			mv.addObject("center","cust/registerfail");
		}

		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(ModelAndView mv) {
		List<CustVo> list = null;
		
		try {
			list = biz.get();
			mv.addObject("allcust", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/get");
		return mv;
	}
	
	@RequestMapping("/getcustdetail")
	public ModelAndView getcustdetail(ModelAndView mv, String id) {
		CustVo obj = null;
		try {
			obj = biz.get(id);
			mv.addObject("dcust", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/getcustdetail");
		return mv;
	}
	
	@RequestMapping("/delete")
	public String delete(String id) {
		
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:get";
	}
	
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv, String id) {
		CustVo obj = null;
		try {
			obj = biz.get(id);
			mv.addObject("ucust", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/update");
		return mv;
	}
	
	@RequestMapping("/updateimpl")
	public String updateimpl(CustVo obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:getcustdetail?id="+obj.getId();
	}
}
