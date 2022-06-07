package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.CustVo;

@SpringBootTest
class CustTests {

	@Test
	void contextLoads() {
		CustVo cust = new CustVo("id01", "pwd01", "kim");
		System.out.println(cust);
		System.out.println(cust.getName());
		
	}

}
