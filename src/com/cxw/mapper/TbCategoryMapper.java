package com.cxw.mapper;

import com.cxw.pojo.TbCategory;
import com.cxw.pojo.TbCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryMapper {
    int countByExample(TbCategoryExample example);

    int deleteByExample(TbCategoryExample example);

    int deleteByPrimaryKey(Long categoryId);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    List<TbCategory> selectByExample(TbCategoryExample example);

    TbCategory selectByPrimaryKey(Long categoryId);

    int updateByExampleSelective(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExample(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}