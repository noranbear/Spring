package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Repository
@Mapper
public interface CartMapper {

	public void insert(CartVo ca) throws Exception;
	public void delete(Integer id) throws Exception;
	public void update(CartVo ca) throws Exception;
	
	public CartVo select(Integer id) throws Exception;
	public List<CartVo> selectall() throws Exception;
}
