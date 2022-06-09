package com.multi.vo;

import java.util.Date;

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
public class CartVo {
	private int id;
	private String uid;
	private int pid;
	private Date regdate;
	private int cnt;
	
	private String pname;
	private int pprice;
	private String catename;
	
	public CartVo(String uid, int pid, int cnt) {
		this.uid = uid;
		this.pid = pid;
		this.cnt = cnt;
	}

	public CartVo(int id, String uid, int pid, int cnt) {
		this.id = id;
		this.uid = uid;
		this.pid = pid;
		this.cnt = cnt;
	}
	
	
	
}
