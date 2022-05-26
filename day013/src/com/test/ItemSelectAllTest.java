package com.test;

import java.util.List;

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
public class ItemSelectAllTest {

	/**
	 * Spring ȯ���� ����� ���� ItemDao�� SelectAll method�� ����Ǿ� �ִ� ItemService�� GetAll method�� �׽�Ʈ�Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, ItemVo> service = 
				(Service<String, ItemVo>) factory.getBean("iservice");
		
		List<ItemVo> li = null;
		li = service.get();
		
		for (ItemVo it : li) {
			System.out.println(it);
		}
		
	}

}
