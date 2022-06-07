package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author noranbear
 * @date 2022. 6. 2.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 2.			noranbear			    First
 *
 * =========================================================
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ProductVo {
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private double rate;
	

	public ProductVo(String name, int price, double rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
	}

	public ProductVo(String name, int price, Date regdate, double rate) {
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.rate = rate;
	}

	public ProductVo(int id, String name, int price, double rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rate = rate;
	}
	
	
}
