package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SampleInfo;
import net.jikuodong.springboot.po.SampleInfoExample;
import org.apache.ibatis.annotations.Param;

public interface SampleInfoMapper {
    long countByExample(SampleInfoExample example);

    int deleteByExample(SampleInfoExample example);

    int deleteByPrimaryKey(String sampleId);

    int insert(SampleInfo record);

    int insertSelective(SampleInfo record);

    List<SampleInfo> selectByExample(SampleInfoExample example);

    SampleInfo selectByPrimaryKey(String sampleId);

    int updateByExampleSelective(@Param("record") SampleInfo record, @Param("example") SampleInfoExample example);

    int updateByExample(@Param("record") SampleInfo record, @Param("example") SampleInfoExample example);

    int updateByPrimaryKeySelective(SampleInfo record);

    int updateByPrimaryKey(SampleInfo record);
}