package com.jslh.dao.mapper;

import com.jslh.model.SysArea;
import com.jslh.model.SysAreaExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysAreaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int countByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int deleteByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int deleteByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int insert(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int insertSelective(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	List<SysArea> selectByExample(SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	SysArea selectByPrimaryKey(String code);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int updateByExampleSelective(@Param("record") SysArea record,
			@Param("example") SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int updateByExample(@Param("record") SysArea record,
			@Param("example") SysAreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int updateByPrimaryKeySelective(SysArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_area
	 * @mbggenerated  Thu Mar 05 16:54:23 CST 2015
	 */
	int updateByPrimaryKey(SysArea record);
}