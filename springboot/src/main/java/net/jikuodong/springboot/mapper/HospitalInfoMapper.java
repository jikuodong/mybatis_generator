package net.jikuodong.springboot.mapper;

import java.util.List;
import net.jikuodong.springboot.po.HospitalInfo;
import net.jikuodong.springboot.po.HospitalInfoExample;

public interface HospitalInfoMapper {
    long countByExample(HospitalInfoExample example);

    int deleteByExample(HospitalInfoExample example);

    int deleteByPrimaryKey(String hospitalId);

    int insert(HospitalInfo record);

    int insertSelective(HospitalInfo record);

    List<HospitalInfo> selectByExample(HospitalInfoExample example);

    HospitalInfo selectByPrimaryKey(String hospitalId);

    int updateByPrimaryKeySelective(HospitalInfo record);

    int updateByPrimaryKey(HospitalInfo record);
}