package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.CqtRecord;
import org.buzheng.demo.esm.domain.CqtRecordExample;

public interface CqtRecordMapper {
    long countByExample(CqtRecordExample example);

    int deleteByExample(CqtRecordExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(CqtRecord record);

    int insertSelective(CqtRecord record);

    List<CqtRecord> selectByExample(CqtRecordExample example);

    CqtRecord selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") CqtRecord record, @Param("example") CqtRecordExample example);

    int updateByExample(@Param("record") CqtRecord record, @Param("example") CqtRecordExample example);

    int updateByPrimaryKeySelective(CqtRecord record);

    int updateByPrimaryKey(CqtRecord record);
}