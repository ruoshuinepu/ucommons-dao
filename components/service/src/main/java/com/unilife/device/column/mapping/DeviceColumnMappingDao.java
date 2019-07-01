package com.unilife.device.column.mapping;

import com.unilife.device.column.mapping.po.DeviceColumnMappingPO;


public interface DeviceColumnMappingDao {


    int deleteByPrimaryKey(Integer id);

    int insert(DeviceColumnMappingPO record);

    int insertSelective(DeviceColumnMappingPO record);



    DeviceColumnMappingPO selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(DeviceColumnMappingPO record);

    int updateByPrimaryKey(DeviceColumnMappingPO record);
}
