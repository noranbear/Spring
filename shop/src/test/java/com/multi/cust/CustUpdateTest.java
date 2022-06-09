package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

@SpringBootTest
class CustUpdateTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		CustVo c = new CustVo("id02","Man","seoul",null,"123");
		
		try {
			biz.modify(c);
			System.out.println("modified ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
