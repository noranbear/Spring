package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVo;

@SpringBootTest
class CartUpdateTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVo c = new CartVo(1006,"id02",1007,2);
		
		try {
			biz.modify(c);
			System.out.println("modified ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
