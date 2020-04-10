package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.ServiceArea;
import org.buzheng.demo.esm.domain.ServiceAreaExample;

public interface ServiceAreaMapper {
    long countByExample(ServiceAreaExample example);

    int deleteByExample(ServiceAreaExample example);

    int insert(ServiceArea record);

    int insertSelective(ServiceArea record);

    List<ServiceArea> selectByExample(ServiceAreaExample example);

    int updateByExampleSelective(@Param("record") ServiceArea record, @Param("example") ServiceAreaExample example);

    int updateByExample(@Param("record") ServiceArea record, @Param("example") ServiceAreaExample example);
}