package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.CustMapper;
import com.multi.vo.CustVo;

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
@Service("custbiz")
public class CustBiz implements Biz<String,CustVo>{

	@Autowired
	CustMapper dao;
	
	@Override
	public void register(CustVo v) throws Exception {
		//데이터 검증
		dao.insert(v);	//데이터 넣기
		// 메일전송
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(CustVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public CustVo get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CustVo> get() throws Exception {
		return dao.selectall();
	}

}
