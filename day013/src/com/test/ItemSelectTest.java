package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVo;

/**
 * @author noranbear
 * @date 2022. 5. 26.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public class ItemSelectTest {

	/**
	 * Spring 환경을 만들어 놓고 ItemDao의 Select method와 연결되어 있는 ItemService의 Get method를 테스트한다.
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, ItemVo> service = 
				(Service<String, ItemVo>) factory.getBean("iservice");
		
		ItemVo it = null;
		it = service.get("4");
		System.out.println(it);
	}

}
