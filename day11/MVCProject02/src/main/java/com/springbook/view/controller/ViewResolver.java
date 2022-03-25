package com.springbook.view.controller;

public class ViewResolver {
	public String prifix;
	public String suffix;
	
	
	public void setPrifix(String prifix) {
		this.prifix = prifix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public  String getView(String viewName) {
		return prifix + viewName + suffix;
	}
	
}
