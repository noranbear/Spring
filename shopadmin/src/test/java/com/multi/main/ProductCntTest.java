package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.controller.MainBiz;

@SpringBootTest
class ProductCntTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		
		int cnt = 0;
		try {
			cnt = biz.getProductCnt();
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
