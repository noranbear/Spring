package com.item;

import java.util.List;

import com.frame.Dao;
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
public class ItemService implements Service<String, ItemVo> {

	Dao<String, ItemVo> dao;
	
	// Getters and Setters
	public Dao<String, ItemVo> getDao() {
		return dao;
	}

	public void setDao(Dao<String, ItemVo> dao) {
		this.dao = dao;
	}

	// Overriding Methods
	@Override
	public void register(ItemVo v) {
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
	}

	@Override
	public void modify(ItemVo v) {
		dao.update(v);
	}

	@Override
	public ItemVo get(String k) {

		return dao.select(k);
	}

	@Override
	public List<ItemVo> get() {
		return dao.select();
	}

}
