package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SysDicType;
import net.jikuodong.springboot.po.SysDicTypeExample;
import org.apache.ibatis.annotations.Param;

public interface SysDicTypeMapper {
    long countByExample(SysDicTypeExample example);

    int deleteByExample(SysDicTypeExample example);

    int deleteByPrimaryKey(String dicId);

    int insert(SysDicType record);

    int insertSelective(SysDicType record);

    List<SysDicType> selectByExample(SysDicTypeExample example);

    SysDicType selectByPrimaryKey(String dicId);

    int updateByExampleSelective(@Param("record") SysDicType record, @Param("example") SysDicTypeExample example);

    int updateByExample(@Param("record") SysDicType record, @Param("example") SysDicTypeExample example);

    int updateByPrimaryKeySelective(SysDicType record);

    int updateByPrimaryKey(SysDicType record);
}