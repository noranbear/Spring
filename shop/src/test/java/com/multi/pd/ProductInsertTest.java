package com.multi.pd;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class ProductInsertTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		Date date = new Date();
		ProductVo p = new ProductVo("yellow short jeans", 40000, 11,"yellow.jpg");
		
		try {
			biz.register(p);
			System.out.println("registered ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
