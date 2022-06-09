package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVo;

@SpringBootTest
class CustUpdateTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		CateVo c = new CateVo(11, "long sleeve shirt",21);
		
		try {
			biz.modify(c);
			System.out.println("modified ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
