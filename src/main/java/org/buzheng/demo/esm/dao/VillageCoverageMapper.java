package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.VillageCoverage;
import org.buzheng.demo.esm.domain.VillageCoverageExample;

public interface VillageCoverageMapper {
    long countByExample(VillageCoverageExample example);

    int deleteByExample(VillageCoverageExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(VillageCoverage record);

    int insertSelective(VillageCoverage record);

    List<VillageCoverage> selectByExample(VillageCoverageExample example);

    VillageCoverage selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") VillageCoverage record, @Param("example") VillageCoverageExample example);

    int updateByExample(@Param("record") VillageCoverage record, @Param("example") VillageCoverageExample example);

    int updateByPrimaryKeySelective(VillageCoverage record);

    int updateByPrimaryKey(VillageCoverage record);
}