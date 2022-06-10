package com.multi.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
public class ProductVo {
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private int cid;
	private String imgname;
	private String catename;
	private String maincatename;
	// 화면에서 파일을 전송할 때, 이곳에 담겨서 서버로 전송된다.
	private MultipartFile mf;	
	 
	
	public ProductVo(String name, int price, int cid, String imgname) {
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.imgname = imgname;
	}
	
	
}


