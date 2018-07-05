package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SysData;
import net.jikuodong.springboot.po.SysDataExample;
import org.apache.ibatis.annotations.Param;

public interface SysDataMapper {
    long countByExample(SysDataExample example);

    int deleteByExample(SysDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysData record);

    int insertSelective(SysData record);

    List<SysData> selectByExample(SysDataExample example);

    SysData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysData record, @Param("example") SysDataExample example);

    int updateByExample(@Param("record") SysData record, @Param("example") SysDataExample example);

    int updateByPrimaryKeySelective(SysData record);

    int updateByPrimaryKey(SysData record);
}