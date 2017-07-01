package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.BaseDict;

public interface DictMapper {
	
	public List<BaseDict> findDictByTypeCode(String code);
	
}
