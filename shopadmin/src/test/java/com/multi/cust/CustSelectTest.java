package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

@SpringBootTest
class CustSelectTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		CustVo c = null;
		
		try {
			c = biz.get("id02");
			System.out.println("selected ok");
			System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
