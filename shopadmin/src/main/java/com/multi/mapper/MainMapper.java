package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author noranbear
 * @date 2022. 6. 9.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 9.			noranbear			    First
 *
 * =========================================================
 */
@Repository
@Mapper
public interface MainMapper {

	public int getcustcnt() throws Exception;
	public int getproductcnt() throws Exception;
}
