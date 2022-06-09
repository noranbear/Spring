package com.multi.pd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;

@SpringBootTest
class ProductDeleteTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(1009);
			System.out.println("removed ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
