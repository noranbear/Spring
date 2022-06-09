package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVo;

@SpringBootTest
class CateInsertTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		CateVo c = new CateVo(61,"cap",60);
		
		try {
			biz.register(c);
			System.out.println("registered ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
