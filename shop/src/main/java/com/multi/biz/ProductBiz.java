package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ProductMapper;
import com.multi.vo.ProductAvgVo;
import com.multi.vo.ProductVo;

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
@Service("productbiz")
public class ProductBiz implements Biz<Integer, ProductVo> {

	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVo v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(ProductVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public ProductVo get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ProductVo> get() throws Exception {
		return dao.selectall();
	}
	
	public List<ProductVo> get2() throws Exception {
		return dao.selectall2();
	}
	
	public List<ProductAvgVo> getAvg() throws Exception {
		return dao.selectavg();
	}

	
}
