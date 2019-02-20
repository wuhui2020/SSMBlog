package com.wu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wu.dao.CategroyMapper;
import com.wu.domain.Categroy;
import com.wu.interfaces.CategroyInterface;

@Service("categroyService")
public class CategroyService implements CategroyInterface {
	@Autowired
	private CategroyMapper categroyMapper;
	
	@Override
	public List<Categroy> search() {
		List<Categroy> list = new ArrayList<Categroy>();
		list = categroyMapper.search();
//		System.out.println(list);
		return list;
	}

	@Override
	public int updateCategroy(Categroy categroy) {
		return categroyMapper.updateCategroy(categroy);
	}

	@Override
	public int addCategroy(Categroy categroy) {
		return categroyMapper.addCategroy(categroy);
		
	}

	@Override
	public int delCategroy(int cid) {
		return categroyMapper.delCategroy(cid);
		
	}

	
	

}
