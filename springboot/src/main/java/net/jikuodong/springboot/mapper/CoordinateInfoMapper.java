package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.CoordinateInfo;
import net.jikuodong.springboot.po.CoordinateInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CoordinateInfoMapper {
    long countByExample(CoordinateInfoExample example);

    int deleteByExample(CoordinateInfoExample example);

    int deleteByPrimaryKey(String coordinateId);

    int insert(CoordinateInfo record);

    int insertSelective(CoordinateInfo record);

    List<CoordinateInfo> selectByExample(CoordinateInfoExample example);

    CoordinateInfo selectByPrimaryKey(String coordinateId);

    int updateByExampleSelective(@Param("record") CoordinateInfo record, @Param("example") CoordinateInfoExample example);

    int updateByExample(@Param("record") CoordinateInfo record, @Param("example") CoordinateInfoExample example);

    int updateByPrimaryKeySelective(CoordinateInfo record);

    int updateByPrimaryKey(CoordinateInfo record);
}