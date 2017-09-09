package com.justin.factory;

public abstract class Item {
	private String name;
	private int itemLevel;
	
	public Item(String name, int itemLevel) {
		super();
		this.name = name;
		this.itemLevel = itemLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getItemLevel() {
		return itemLevel;
	}
	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	
}
