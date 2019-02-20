package com.wu.interfaces;

import java.util.List;

import com.wu.domain.Categroy;

public interface CategroyInterface {
	
	public List<Categroy> search();
	
	public int updateCategroy(Categroy categroy);
	
	public int addCategroy(Categroy categroy);
	
	public int delCategroy(int cid);
	
}
