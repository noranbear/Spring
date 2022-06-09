package com.multi.pd;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductAvgVo;

@SpringBootTest
class ProductSelectAvgTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		List<ProductAvgVo> li = null;
		
		try {
			li = biz.getAvg();
			System.out.println("got avg ok");
			for (ProductAvgVo p : li) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
