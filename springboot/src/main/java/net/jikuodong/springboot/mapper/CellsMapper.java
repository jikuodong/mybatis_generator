package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.Cells;
import net.jikuodong.springboot.po.CellsExample;

public interface CellsMapper {
    long countByExample(CellsExample example);

    int deleteByExample(CellsExample example);

    int deleteByPrimaryKey(String patId);

    int insert(Cells record);

    int insertSelective(Cells record);

    List<Cells> selectByExample(CellsExample example);

    Cells selectByPrimaryKey(String patId);
    int updateByPrimaryKeySelective(Cells record);

    int updateByPrimaryKey(Cells record);
}