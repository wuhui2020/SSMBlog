package com.wu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wu.domain.Categroy;
import com.wu.service.CategroyService;

@Controller
@RequestMapping("categroy")
public class CategroyController {
	@Autowired
	private CategroyService categroyService;
	
	@PostMapping("/search")
	@ResponseBody
	public List<Categroy> search(){
		List<Categroy> list = new ArrayList<Categroy>();
		
		list = categroyService.search();
//		System.out.println(list);
		return list;
	}
	
	@PostMapping("/updateCategroy")
	@ResponseBody
	public List<Map<String,Object>> updateCategroy(Categroy categroy){
		List<Map<String,Object>> list  = new ArrayList<>();
		Map<String,Object> map = new HashMap<String,Object>();
		
		int count = categroyService.updateCategroy(categroy);
//		System.out.println(count);
		if(count > 0){
			map.put("MSG", "OK");
			map.put("total", count);
		}else{
			map.put("MSG", "修改不成功");
		}
		list.add(map);
		return list;
	}
	
	@PostMapping("/addCategroy")
	@ResponseBody
	public List<Map<String,Object>> addCategroy(Categroy categroy){
		List<Map<String,Object>> list  = new ArrayList<>();
		Map<String,Object> map = new HashMap<String,Object>();
		
		int count = categroyService.addCategroy(categroy);
//		System.out.println(count);
		if(count > 0){
			map.put("MSG", "OK");
			map.put("total", count);
		}else{
			map.put("MSG", "添加不成功");
		}
		list.add(map);
		return list;
	}
	
	@PostMapping("/delCategroy")
	@ResponseBody
	public String delCategroy(Integer cid){
		
		int count = categroyService.delCategroy(cid);
//		System.out.println(count);
		if(count > 0){
			return "OK";
		}else{
			return "删除失败！";
		}
	}
	
}
