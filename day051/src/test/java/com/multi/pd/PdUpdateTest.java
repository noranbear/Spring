package com.multi.pd;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVo;

@SpringBootTest
class PdUpdateTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		ProductVo pd = new ProductVo(1001,"sing",5000000,4.5);
		
		try {
			biz.modify(pd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
