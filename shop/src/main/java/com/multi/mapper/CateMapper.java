package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Repository
@Mapper
public interface CateMapper {

	public void insert(CateVo ct) throws Exception;
	public void delete(Integer id) throws Exception;
	public void update(CateVo ct) throws Exception;
	
	public CateVo select(Integer id) throws Exception;
	public List<CateVo> selectall() throws Exception;
	
	public List<CateVo> selectmain() throws Exception;
}
