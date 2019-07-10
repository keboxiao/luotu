package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.TempManchg;
import org.buzheng.demo.esm.domain.TempManchgExample;

public interface TempManchgMapper {
    long countByExample(TempManchgExample example);

    int deleteByExample(TempManchgExample example);

    int deleteByPrimaryKey(String id);

    int insert(TempManchg record);

    int insertSelective(TempManchg record);

    List<TempManchg> selectByExample(TempManchgExample example);

    TempManchg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TempManchg record, @Param("example") TempManchgExample example);

    int updateByExample(@Param("record") TempManchg record, @Param("example") TempManchgExample example);

    int updateByPrimaryKeySelective(TempManchg record);

    int updateByPrimaryKey(TempManchg record);
}