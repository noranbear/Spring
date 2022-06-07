package com.multi.pd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class PdDeleteTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
