package com.briup.crm.dao;

import com.briup.crm.bean.CstLinkman;
import com.briup.crm.bean.CstLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    long countByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int deleteByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int deleteByPrimaryKey(Long lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int insert(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int insertSelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    List<CstLinkman> selectByExample(CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    CstLinkman selectByPrimaryKey(Long lkmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByExample(@Param("record") CstLinkman record, @Param("example") CstLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByPrimaryKeySelective(CstLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cst_linkman
     *
     * @mbg.generated Wed Jan 01 16:35:01 CST 2020
     */
    int updateByPrimaryKey(CstLinkman record);
}