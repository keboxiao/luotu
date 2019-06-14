package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.SevenLevelAddress;
import org.buzheng.demo.esm.domain.SevenLevelAddressExample;

public interface SevenLevelAddressMapper {
    long countByExample(SevenLevelAddressExample example);

    int deleteByExample(SevenLevelAddressExample example);

    int insert(SevenLevelAddress record);

    int insertSelective(SevenLevelAddress record);

    List<SevenLevelAddress> selectByExample(SevenLevelAddressExample example);

    int updateByExampleSelective(@Param("record") SevenLevelAddress record, @Param("example") SevenLevelAddressExample example);

    int updateByExample(@Param("record") SevenLevelAddress record, @Param("example") SevenLevelAddressExample example);
}