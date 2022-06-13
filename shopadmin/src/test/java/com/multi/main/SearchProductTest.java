package com.multi.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class SearchProductTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		
		List<ProductVo> li = null;
		
		try {
			li = biz.getproduct("2");
			System.out.println("got name list ok");
			for (ProductVo p : li) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
