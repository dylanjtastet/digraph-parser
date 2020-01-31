package com.paypal.digraph.parser;

public class Subgraph {
	Subgraph parent;
	String name;
	
	Subgraph(Subgraph parent){
		this.name = "";
		this.parent = parent;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Subgraph getParent() {
		return this.parent;
	}
}
