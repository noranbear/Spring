package com.multi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author noranbear
 * @date 2022. 6. 7.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 7.			noranbear			    First
 *
 * =========================================================
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CateVo {
	private int id;
	private String name;
	private int pid;
	
	public CateVo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}
