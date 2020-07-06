package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.BaseStation;
import org.buzheng.demo.esm.domain.BaseStationExample;

public interface BaseStationMapper {
    long countByExample(BaseStationExample example);

    int deleteByExample(BaseStationExample example);

    int deleteByPrimaryKey(String baseId);

    int insert(BaseStation record);

    int insertSelective(BaseStation record);

    List<BaseStation> selectByExample(BaseStationExample example);

    BaseStation selectByPrimaryKey(String baseId);

    int updateByExampleSelective(@Param("record") BaseStation record, @Param("example") BaseStationExample example);

    int updateByExample(@Param("record") BaseStation record, @Param("example") BaseStationExample example);

    int updateByPrimaryKeySelective(BaseStation record);

    int updateByPrimaryKey(BaseStation record);
}