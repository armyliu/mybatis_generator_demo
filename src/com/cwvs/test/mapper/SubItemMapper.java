package com.cwvs.test.mapper;

import com.cwvs.test.bean.SubItem;
import com.cwvs.test.bean.SubItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubItemMapper {
    int countByExample(SubItemExample example);

    int deleteByExample(SubItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubItem record);

    int insertSelective(SubItem record);

    List<SubItem> selectByExample(SubItemExample example);

    SubItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubItem record, @Param("example") SubItemExample example);

    int updateByExample(@Param("record") SubItem record, @Param("example") SubItemExample example);

    int updateByPrimaryKeySelective(SubItem record);

    int updateByPrimaryKey(SubItem record);
}