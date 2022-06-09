package com.multi.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVo;

@SpringBootTest
class CateSelectMainTest {
	
	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		List<CateVo> list = null;
		
		try {
			list = biz.getmain();
			System.out.println("selected main ok");
			for (CateVo c : list) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
