package com.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.demo.entities.Product;

@Mapper
public interface ProductMapper {
	@Select("SELECT id, name, price, created_time as createdTime FROM mt_p WHERE id = #{id}")
	Product getProduct(@Param("id") Integer id);
}

