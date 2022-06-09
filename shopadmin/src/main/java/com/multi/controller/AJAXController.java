package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CateVo;
import com.multi.vo.CustVo;
import com.multi.vo.ProductVo;

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
@RestController
public class AJAXController {

	@Autowired
	CustBiz cbiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	CateBiz ctbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		CustVo obj = null;
		String result = "";
		
		try {
			obj = cbiz.get(id);
			// DB에 없는 값일 때 NULL을 보낸다는 것을 TEST로 확인했음.
			if(obj == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("checkpid")
	public String checkpid(int id) {
		ProductVo obj = null;
		String result = "";
		
		try {
			obj = pbiz.get(id);
			// DB에 없는 값일 때 NULL을 보낸다는 것을 TEST로 확인했음.
			if(obj == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("checkcateid")
	public String checkcateid(int id) {
		CateVo obj = null;
		String result = "";
		
		try {
			obj = ctbiz.get(id);
			// DB에 없는 값일 때 NULL을 보낸다는 것을 TEST로 확인했음.
			if(obj == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
