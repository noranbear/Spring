package com.user;

import java.util.List;

import com.frame.Dao;
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
public class UserService implements Service<String, UserVo> {

	Dao<String, UserVo> dao;	// dao에 dependenct injection을 해줘야함 -> getters and setters 생성
	
	// Getters and Setters
	public Dao<String, UserVo> getDao() {
		return dao;
	}

	public void setDao(Dao<String, UserVo> dao) {	// spring.xml에 주입될 이름
		this.dao = dao;
	}

	// Overridng Method
	@Override
	public void register(UserVo v) {
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
	}

	@Override
	public void modify(UserVo v) {
		dao.update(v);
	}

	@Override
	public UserVo get(String k) {
		
		return dao.select(k);
	}

	@Override
	public List<UserVo> get() {
		
		return dao.select();
	}

}
