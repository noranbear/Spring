/**
 * 
 */
package com.user;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
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
public class UserDao implements Dao<String, UserVo> {

	@Override
	public void insert(UserVo v) {
		System.out.println("Inserted: "+ v);
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted: "+ k);
	}

	@Override
	public void update(UserVo v) {
		System.out.println("Updated: "+ v);
	}

	@Override
	public UserVo select(String k) {
		UserVo user = new UserVo(k,"pwd02","kim");	// 가상의 데이터값
		return user;
	}

	@Override
	public List<UserVo> select() {
		ArrayList<UserVo> li = new ArrayList<UserVo>();
		li.add(new UserVo("id01","pwd01","lee"));	// 가상의 데이터값
		li.add(new UserVo("id02","pwd02","kim"));
		li.add(new UserVo("id03","pwd03","kang"));
		li.add(new UserVo("id04","pwd04","park"));
		li.add(new UserVo("id05","pwd05","son"));
		
		return li;
	}

}
