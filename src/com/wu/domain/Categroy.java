package com.wu.domain;

import java.io.Serializable;

public class Categroy implements Serializable{
	private Integer cid;
	private String cname;
	private Integer parentid;
	public Categroy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categroy(Integer cid, String cname, Integer parentid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.parentid = parentid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	@Override
	public String toString() {
		return "Categroy [cid=" + cid + ", cname=" + cname + ", parentid=" + parentid + "]";
	}
	
	
	
}
