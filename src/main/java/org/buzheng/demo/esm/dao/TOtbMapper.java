package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.TOtb;
import org.buzheng.demo.esm.domain.TOtbExample;

public interface TOtbMapper {
    long countByExample(TOtbExample example);

    int deleteByExample(TOtbExample example);

    int deleteByPrimaryKey(String otbCode);

    int insert(TOtb record);

    int insertSelective(TOtb record);

    List<TOtb> selectByExample(TOtbExample example);

    TOtb selectByPrimaryKey(String otbCode);

    int updateByExampleSelective(@Param("record") TOtb record, @Param("example") TOtbExample example);

    int updateByExample(@Param("record") TOtb record, @Param("example") TOtbExample example);

    int updateByPrimaryKeySelective(TOtb record);

    int updateByPrimaryKey(TOtb record);
}