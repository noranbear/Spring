package com.multi.pd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class ProductSelectTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		ProductVo p = null;
		try {
			p = biz.get(1008);
			System.out.println("got ok");
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
