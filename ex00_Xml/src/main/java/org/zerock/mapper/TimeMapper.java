package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();//annotation 방식
	
	public String getTime2(); //xml매퍼 방식
}
