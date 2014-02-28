package com.cwvs.test.mapper;

import com.cwvs.test.bean.AppFile;
import com.cwvs.test.bean.AppFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppFileMapper {
    int countByExample(AppFileExample example);

    int deleteByExample(AppFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppFile record);

    int insertSelective(AppFile record);

    List<AppFile> selectByExampleWithBLOBs(AppFileExample example);

    List<AppFile> selectByExample(AppFileExample example);

    AppFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppFile record, @Param("example") AppFileExample example);

    int updateByExampleWithBLOBs(@Param("record") AppFile record, @Param("example") AppFileExample example);

    int updateByExample(@Param("record") AppFile record, @Param("example") AppFileExample example);

    int updateByPrimaryKeySelective(AppFile record);

    int updateByPrimaryKeyWithBLOBs(AppFile record);

    int updateByPrimaryKey(AppFile record);
}