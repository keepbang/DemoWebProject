package com.bang.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper {
	
	@Insert("INSERT INTO ACCESS_TABLE_LOG(USER_ID,USER_NAME) VALUES(#{user_id},#{user_name})")
	public void insertAccessLog(@Param("user_id") String id, @Param("user_name") String name);
}
