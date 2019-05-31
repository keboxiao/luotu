package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.Upfile;
import org.buzheng.demo.esm.domain.UpfileExample;

public interface UpfileMapper {
    long countByExample(UpfileExample example);

    int deleteByExample(UpfileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(Upfile record);

    int insertSelective(Upfile record);

    List<Upfile> selectByExample(UpfileExample example);

    Upfile selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") Upfile record, @Param("example") UpfileExample example);

    int updateByExample(@Param("record") Upfile record, @Param("example") UpfileExample example);

    int updateByPrimaryKeySelective(Upfile record);

    int updateByPrimaryKey(Upfile record);
}