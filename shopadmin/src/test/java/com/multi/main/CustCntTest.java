package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;

@SpringBootTest
class CustCntTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		
		int cnt = 0;
		try {
			cnt = biz.getCustCnt();
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
