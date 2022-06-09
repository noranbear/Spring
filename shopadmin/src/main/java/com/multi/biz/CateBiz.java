package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CateMapper;
import com.multi.vo.CateVo;

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
@Service("catebiz")
public class CateBiz implements Biz<Integer, CateVo> {

	@Autowired
	CateMapper dao;
	
	@Override
	public void register(CateVo v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(CateVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public CateVo get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CateVo> get() throws Exception {
		return dao.selectall();
	}
	
	public List<CateVo> getmain() throws Exception{
		return dao.selectmain();
	}

	
}
