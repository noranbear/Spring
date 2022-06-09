package com.multi.pd;

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
		
		ProductVo p = new ProductVo("blue short pants", 34000, 11,"blue.jpg");
		
		try {
			biz.register(p);
			System.out.println("registered ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
