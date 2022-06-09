package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVo;

@SpringBootTest
class CartSelectTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		CartVo c = null;
		
		try {
			c = biz.get(1004);
			System.out.println("selected ok");
			System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
