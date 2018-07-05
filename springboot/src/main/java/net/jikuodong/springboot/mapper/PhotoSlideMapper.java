package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.PhotoSlide;
import net.jikuodong.springboot.po.PhotoSlideExample;
import org.apache.ibatis.annotations.Param;

public interface PhotoSlideMapper {
    long countByExample(PhotoSlideExample example);

    int deleteByExample(PhotoSlideExample example);

    int deleteByPrimaryKey(String slideId);

    int insert(PhotoSlide record);

    int insertSelective(PhotoSlide record);

    List<PhotoSlide> selectByExample(PhotoSlideExample example);

    PhotoSlide selectByPrimaryKey(String slideId);

    int updateByExampleSelective(@Param("record") PhotoSlide record, @Param("example") PhotoSlideExample example);

    int updateByExample(@Param("record") PhotoSlide record, @Param("example") PhotoSlideExample example);

    int updateByPrimaryKeySelective(PhotoSlide record);

    int updateByPrimaryKey(PhotoSlide record);
}