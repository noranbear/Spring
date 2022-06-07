package com.multi.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class AjaxController {
	
	@Autowired
	ProductBiz pbiz;
	
	@RequestMapping("/chartimp")
	public Object chartimp() {
		//{'cate':['p1','p2','p3','p4','p5'],
		// 'data':[10000,30000,20000,40000,15000]}
		// 처럼 데이터를 json-배열로 변환해야 한다.
		
		JSONObject jo = new JSONObject();
		JSONArray ja1 = new JSONArray();
		JSONArray ja2 = new JSONArray();
		// 데이터 가져오기 - select로 가져올 수 있다.
		List<ProductVo> list = null;
		
		try {
			list = pbiz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// json 형태로 만들기
		for (ProductVo p : list) {
			ja1.add(p.getName());
			ja2.add(p.getPrice());
		}
		jo.put("cate", ja1);
		jo.put("data", ja2);
		
		return jo;
	}
}
