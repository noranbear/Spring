package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVo;

@SpringBootTest
class CartInsertTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVo c = new CartVo("id01",1008,1);
		
		try {
			biz.register(c);
			System.out.println("registered ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
