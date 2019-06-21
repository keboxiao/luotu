package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.GetAddressTask;
import org.buzheng.demo.esm.domain.GetAddressTaskExample;

public interface GetAddressTaskMapper {
    long countByExample(GetAddressTaskExample example);

    int deleteByExample(GetAddressTaskExample example);

    int deleteByPrimaryKey(String taskId);

    int insert(GetAddressTask record);

    int insertSelective(GetAddressTask record);

    List<GetAddressTask> selectByExample(GetAddressTaskExample example);

    GetAddressTask selectByPrimaryKey(String taskId);

    int updateByExampleSelective(@Param("record") GetAddressTask record, @Param("example") GetAddressTaskExample example);

    int updateByExample(@Param("record") GetAddressTask record, @Param("example") GetAddressTaskExample example);

    int updateByPrimaryKeySelective(GetAddressTask record);

    int updateByPrimaryKey(GetAddressTask record);
}