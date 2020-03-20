package com.briup.crm.dao;

import com.briup.crm.bean.CstActivity;
import com.briup.crm.bean.CstActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    long countByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int deleteByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int deleteByPrimaryKey(Long atvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int insert(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int insertSelective(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    List<CstActivity> selectByExample(CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    CstActivity selectByPrimaryKey(Long atvId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByExample(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByPrimaryKeySelective(CstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_activity
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByPrimaryKey(CstActivity record);
}