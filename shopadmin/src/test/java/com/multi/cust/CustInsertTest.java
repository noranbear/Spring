package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

@SpringBootTest
class CustInsertTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		CustVo c = new CustVo("id03","lan","seoul",null,"123");
		
		try {
			biz.register(c);
			System.out.println("registered ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
