package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.LayerInfo;
import net.jikuodong.springboot.po.LayerInfoExample;
import org.apache.ibatis.annotations.Param;

public interface LayerInfoMapper {
    long countByExample(LayerInfoExample example);

    int deleteByExample(LayerInfoExample example);

    int deleteByPrimaryKey(String layerLogicId);

    int insert(LayerInfo record);

    int insertSelective(LayerInfo record);

    List<LayerInfo> selectByExample(LayerInfoExample example);

    LayerInfo selectByPrimaryKey(String layerLogicId);

    int updateByExampleSelective(@Param("record") LayerInfo record, @Param("example") LayerInfoExample example);

    int updateByExample(@Param("record") LayerInfo record, @Param("example") LayerInfoExample example);

    int updateByPrimaryKeySelective(LayerInfo record);

    int updateByPrimaryKey(LayerInfo record);
}