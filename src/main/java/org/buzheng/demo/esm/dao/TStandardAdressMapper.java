package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.TStandardAdress;
import org.buzheng.demo.esm.domain.TStandardAdressExample;

public interface TStandardAdressMapper {
    long countByExample(TStandardAdressExample example);

    int deleteByExample(TStandardAdressExample example);

    int insert(TStandardAdress record);

    int insertSelective(TStandardAdress record);

    List<TStandardAdress> selectByExample(TStandardAdressExample example);

    int updateByExampleSelective(@Param("record") TStandardAdress record, @Param("example") TStandardAdressExample example);

    int updateByExample(@Param("record") TStandardAdress record, @Param("example") TStandardAdressExample example);
}