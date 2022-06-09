package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/select")
	public String select(Model m) {
		// center page 바꿔주기
		m.addAttribute("center", "cust/select");
		return "/index";
	}
}
