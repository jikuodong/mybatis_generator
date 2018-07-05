package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.PatientCaseInfo;
import net.jikuodong.springboot.po.PatientCaseInfoExample;
import org.apache.ibatis.annotations.Param;

public interface PatientCaseInfoMapper {
    long countByExample(PatientCaseInfoExample example);

    int deleteByExample(PatientCaseInfoExample example);

    int deleteByPrimaryKey(String caseId);

    int insert(PatientCaseInfo record);

    int insertSelective(PatientCaseInfo record);

    List<PatientCaseInfo> selectByExample(PatientCaseInfoExample example);

    PatientCaseInfo selectByPrimaryKey(String caseId);

    int updateByExampleSelective(@Param("record") PatientCaseInfo record, @Param("example") PatientCaseInfoExample example);

    int updateByExample(@Param("record") PatientCaseInfo record, @Param("example") PatientCaseInfoExample example);

    int updateByPrimaryKeySelective(PatientCaseInfo record);

    int updateByPrimaryKey(PatientCaseInfo record);
}