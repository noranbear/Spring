package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Repository
@Mapper
public interface CustMapper {

	public void insert(CustVo cust) throws Exception;
	public void delete(String id) throws Exception;
	public void update(CustVo cust) throws Exception;
	
	public CustVo select(String id) throws Exception;
	public List<CustVo> selectall() throws Exception;
}
