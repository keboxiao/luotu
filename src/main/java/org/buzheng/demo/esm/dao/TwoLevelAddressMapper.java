package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.TwoLevelAddress;
import org.buzheng.demo.esm.domain.TwoLevelAddressExample;

public interface TwoLevelAddressMapper {
    long countByExample(TwoLevelAddressExample example);

    int deleteByExample(TwoLevelAddressExample example);

    int deleteByPrimaryKey(String addrId);

    int insert(TwoLevelAddress record);

    int insertSelective(TwoLevelAddress record);

    List<TwoLevelAddress> selectByExampleWithBLOBs(TwoLevelAddressExample example);

    List<TwoLevelAddress> selectByExample(TwoLevelAddressExample example);

    TwoLevelAddress selectByPrimaryKey(String addrId);

    int updateByExampleSelective(@Param("record") TwoLevelAddress record, @Param("example") TwoLevelAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") TwoLevelAddress record, @Param("example") TwoLevelAddressExample example);

    int updateByExample(@Param("record") TwoLevelAddress record, @Param("example") TwoLevelAddressExample example);

    int updateByPrimaryKeySelective(TwoLevelAddress record);

    int updateByPrimaryKeyWithBLOBs(TwoLevelAddress record);

    int updateByPrimaryKey(TwoLevelAddress record);
}