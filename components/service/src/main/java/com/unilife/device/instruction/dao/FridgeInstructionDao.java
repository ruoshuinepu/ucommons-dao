package com.unilife.device.instruction.dao;

import com.unilife.annotation.UMemberBatisDao;
import com.unilife.device.instruction.po.FridgeInstructionPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;



public interface FridgeInstructionDao {
    public FridgeInstructionPO getFridgeInstructionByModel(@Param("deviceModel") String deviceModel);
}
