package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SlideInfo;
import net.jikuodong.springboot.po.SlideInfoExample;
import org.apache.ibatis.annotations.Param;

public interface SlideInfoMapper {
    long countByExample(SlideInfoExample example);

    int deleteByExample(SlideInfoExample example);

    int deleteByPrimaryKey(String slideId);

    int insert(SlideInfo record);

    int insertSelective(SlideInfo record);

    List<SlideInfo> selectByExample(SlideInfoExample example);

    SlideInfo selectByPrimaryKey(String slideId);

    int updateByExampleSelective(@Param("record") SlideInfo record, @Param("example") SlideInfoExample example);

    int updateByExample(@Param("record") SlideInfo record, @Param("example") SlideInfoExample example);

    int updateByPrimaryKeySelective(SlideInfo record);

    int updateByPrimaryKey(SlideInfo record);
}