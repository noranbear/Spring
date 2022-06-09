package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

@SpringBootTest
class CustdeleteTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove("id03");
			System.out.println("deleted ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
