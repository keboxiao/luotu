package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.FiveLevelAddress;
import org.buzheng.demo.esm.domain.FiveLevelAddressExample;

public interface FiveLevelAddressMapper {
    long countByExample(FiveLevelAddressExample example);

    int deleteByExample(FiveLevelAddressExample example);

    int deleteByPrimaryKey(String addrId);

    int insert(FiveLevelAddress record);

    int insertSelective(FiveLevelAddress record);

    List<FiveLevelAddress> selectByExample(FiveLevelAddressExample example);

    FiveLevelAddress selectByPrimaryKey(String addrId);

    int updateByExampleSelective(@Param("record") FiveLevelAddress record, @Param("example") FiveLevelAddressExample example);

    int updateByExample(@Param("record") FiveLevelAddress record, @Param("example") FiveLevelAddressExample example);

    int updateByPrimaryKeySelective(FiveLevelAddress record);

    int updateByPrimaryKey(FiveLevelAddress record);
}