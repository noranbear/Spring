package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductVo;

/**
 * @author noranbear
 * @date 2022. 6. 2.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 2.			noranbear			    First
 *
 * =========================================================
 */
@Repository
@Mapper
public interface ProductMapper {
	
	public void insert(ProductVo p);
	public void delete(int id);
	public void update(ProductVo p);
	
	public ProductVo select(int id);
	public List<ProductVo> selectall();
	
	public int selectcnt() throws Exception;
}
