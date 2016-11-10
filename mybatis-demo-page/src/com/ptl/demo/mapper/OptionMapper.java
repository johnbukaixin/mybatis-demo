package com.ptl.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ptl.demo.bean.Option;

public interface OptionMapper {

	List<Option> getOptions(@Param("min")int min,@Param("size")int max);
}
