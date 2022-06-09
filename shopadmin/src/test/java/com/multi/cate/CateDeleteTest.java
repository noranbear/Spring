package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVo;

@SpringBootTest
class CateDeleteTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(61);
			System.out.println("deleted ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
