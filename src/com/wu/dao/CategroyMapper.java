package com.wu.dao;

import java.util.List;

import com.wu.domain.Categroy;

public interface CategroyMapper {
	
	public List<Categroy> search();
	
	public int updateCategroy(Categroy categroy);
	
	public int addCategroy(Categroy categroy);
	
	public int delCategroy(int cid);
}
