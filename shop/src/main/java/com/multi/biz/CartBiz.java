package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CartMapper;
import com.multi.vo.CartVo;

/**
 * @author noranbear
 * @date 2022. 6. 7.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 7.			noranbear			    First
 *
 * =========================================================
 */
@Service("cartbiz")
public class CartBiz implements Biz<Integer, CartVo> {

	@Autowired
	CartMapper dao;
	
	@Override
	public void register(CartVo v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(CartVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public CartVo get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CartVo> get() throws Exception {
		return dao.selectall();
	}

}
