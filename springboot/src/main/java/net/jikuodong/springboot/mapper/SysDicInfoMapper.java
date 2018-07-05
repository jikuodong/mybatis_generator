package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SysDicInfo;
import net.jikuodong.springboot.po.SysDicInfoExample;
import org.apache.ibatis.annotations.Param;

public interface SysDicInfoMapper {
    long countByExample(SysDicInfoExample example);

    int deleteByExample(SysDicInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDicInfo record);

    int insertSelective(SysDicInfo record);

    List<SysDicInfo> selectByExample(SysDicInfoExample example);

    SysDicInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDicInfo record, @Param("example") SysDicInfoExample example);

    int updateByExample(@Param("record") SysDicInfo record, @Param("example") SysDicInfoExample example);

    int updateByPrimaryKeySelective(SysDicInfo record);

    int updateByPrimaryKey(SysDicInfo record);
}