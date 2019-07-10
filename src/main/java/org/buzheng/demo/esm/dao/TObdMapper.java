package org.buzheng.demo.esm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.TObd;
import org.buzheng.demo.esm.domain.TObdExample;

public interface TObdMapper {
    long countByExample(TObdExample example);

    int deleteByExample(TObdExample example);

    int insert(TObd record);

    int insertSelective(TObd record);

    List<TObd> selectByExample(TObdExample example);
    
    List<TObd> innerJoinManagerChg(@Param("params") Map<String, Object> params);

    int updateByExampleSelective(@Param("record") TObd record, @Param("example") TObdExample example);

    int updateByExample(@Param("record") TObd record, @Param("example") TObdExample example);
}