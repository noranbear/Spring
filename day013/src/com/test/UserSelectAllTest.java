package com.test;

import java.util.List;

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
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public class UserSelectAllTest {

	/**
	 * Spring 환경을 만들어 놓고 UserDao의 selectAll method와 연결되어 있는 UserService의 getAll method를 테스트한다.
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String, UserVo> service = 
				(Service<String, UserVo>) factory.getBean("uservice");
		
		List<UserVo> li = null;
		li = service.get();
		
		for (UserVo us : li) {
			System.out.println(us);
		}
	}

}
