package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVo;

@SpringBootTest
class CustSelectAllTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		List<CustVo> list = null;
		
		try {
			list = biz.get();
			for (CustVo cust : list) {
				System.out.println(cust);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
