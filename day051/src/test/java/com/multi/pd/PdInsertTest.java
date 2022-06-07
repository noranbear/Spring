package com.multi.pd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class PdInsertTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		ProductVo pd = new ProductVo("dance2",5000000,5);
		
		try {
			biz.register(pd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
