package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVo;

/**
 * @author noranbear
 * @date 2022. 5. 26.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			AUTHOR				   NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public class UserSelectTest {

	/**
	 * Spring ȯ���� ����� ���� UserDao�� select method�� ����Ǿ� �ִ� UserService�� get method�� �׽�Ʈ�Ѵ�.
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVo> service = 
				(Service<String, UserVo>) factory.getBean("uservice");
		
		UserVo u = null;
		u = service.get("1");
		System.out.println(u);
		
	}

}
