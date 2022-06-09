package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Repository
@Mapper
public interface ProductMapper {

	public void insert(ProductVo pd) throws Exception;
	public void delete(Integer id) throws Exception;
	public void update(ProductVo pd) throws Exception;
	
	public ProductVo select(Integer id) throws Exception;
	public List<ProductVo> selectall() throws Exception;
	public List<ProductVo> selectall2() throws Exception;
	public List<ProductAvgVo> selectavg() throws Exception;
}
