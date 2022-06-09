package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;

@SpringBootTest
class CartdeleteTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(1005);
			System.out.println("deleted ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
