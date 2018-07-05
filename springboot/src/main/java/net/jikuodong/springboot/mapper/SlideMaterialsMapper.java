package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.SlideMaterials;
import net.jikuodong.springboot.po.SlideMaterialsExample;
import org.apache.ibatis.annotations.Param;

public interface SlideMaterialsMapper {
    long countByExample(SlideMaterialsExample example);

    int deleteByExample(SlideMaterialsExample example);

    int deleteByPrimaryKey(String slideMaterialId);

    int insert(SlideMaterials record);

    int insertSelective(SlideMaterials record);

    List<SlideMaterials> selectByExample(SlideMaterialsExample example);

    SlideMaterials selectByPrimaryKey(String slideMaterialId);

    int updateByExampleSelective(@Param("record") SlideMaterials record, @Param("example") SlideMaterialsExample example);

    int updateByExample(@Param("record") SlideMaterials record, @Param("example") SlideMaterialsExample example);

    int updateByPrimaryKeySelective(SlideMaterials record);

    int updateByPrimaryKey(SlideMaterials record);
}