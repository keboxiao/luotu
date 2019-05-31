package org.buzheng.demo.esm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.buzheng.demo.esm.domain.FileTopic;
import org.buzheng.demo.esm.domain.FileTopicExample;

public interface FileTopicMapper {
    long countByExample(FileTopicExample example);

    int deleteByExample(FileTopicExample example);

    int deleteByPrimaryKey(String topicId);

    int insert(FileTopic record);

    int insertSelective(FileTopic record);

    List<FileTopic> selectByExample(FileTopicExample example);

    FileTopic selectByPrimaryKey(String topicId);

    int updateByExampleSelective(@Param("record") FileTopic record, @Param("example") FileTopicExample example);

    int updateByExample(@Param("record") FileTopic record, @Param("example") FileTopicExample example);

    int updateByPrimaryKeySelective(FileTopic record);

    int updateByPrimaryKey(FileTopic record);
    
    List<FileTopic> selectByExampleInnerjoinUser(FileTopicExample example);

}