package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.ReportResult;
import net.jikuodong.springboot.po.ReportResultExample;
import org.apache.ibatis.annotations.Param;

public interface ReportResultMapper {
    long countByExample(ReportResultExample example);

    int deleteByExample(ReportResultExample example);

    int deleteByPrimaryKey(String caseId);

    int insert(ReportResult record);

    int insertSelective(ReportResult record);

    List<ReportResult> selectByExampleWithBLOBs(ReportResultExample example);

    List<ReportResult> selectByExample(ReportResultExample example);

    ReportResult selectByPrimaryKey(String caseId);

    int updateByExampleSelective(@Param("record") ReportResult record, @Param("example") ReportResultExample example);

    int updateByExampleWithBLOBs(@Param("record") ReportResult record, @Param("example") ReportResultExample example);

    int updateByExample(@Param("record") ReportResult record, @Param("example") ReportResultExample example);

    int updateByPrimaryKeySelective(ReportResult record);

    int updateByPrimaryKeyWithBLOBs(ReportResult record);

    int updateByPrimaryKey(ReportResult record);
}