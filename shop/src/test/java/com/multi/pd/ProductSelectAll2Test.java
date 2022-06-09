package com.multi.pd;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class ProductSelectAll2Test {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		List<ProductVo> li = null;
		
		try {
			li = biz.get2();
			System.out.println("got all ok");
			for (ProductVo p : li) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
