package com.multi.pd;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class ProductUpdateTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		Date date = new Date();
		ProductVo p = new ProductVo(1007,"hollow short jeans", 250000, date, 11,"hollow.jpg", null,null);
		
		try {
			biz.modify(p);
			System.out.println("modified ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
