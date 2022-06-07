package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CustVo;

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
 *  2022. 6. 2.		noranbear			    First
 *
 * =========================================================
 */
@Repository			// Spring Component 의미
@Mapper				// MyBatis mapper 역할을 한다.
public interface CustMapper {

	public void insert(CustVo cust) throws Exception;
	public void delete(String id) throws Exception;
	public void update(CustVo cust) throws Exception;
	
	public CustVo select(String id) throws Exception;
	public List<CustVo> selectall() throws Exception;
}
