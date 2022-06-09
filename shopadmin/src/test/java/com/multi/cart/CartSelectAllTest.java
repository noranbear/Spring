package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVo;

@SpringBootTest
class CartSelectAllTest {
	
	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		
		List<CartVo> list = null;
		
		try {
			list = biz.get();
			System.out.println("selected all ok");
			for (CartVo c : list) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
