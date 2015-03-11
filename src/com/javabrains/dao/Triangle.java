package com.javabrains.dao;

public class Triangle {

	private String type;
	private int height;
	
	//Constructor injection
	public Triangle(String type)
	{
		this.type = type;
	}
	
	public Triangle(String type,  int height)
	{
		this.type = type;
		this.height = height;
	}
	
	public void draw()
	{
		System.out.println("Draw a triangle by Spring Framework :" + getType() + " of height :" + getHeight());
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	/*public void setHeight(int height) {
		this.height = height;
	}*/

	//Property injection
	/*public void setType(String type) {
		this.type = type;
	}*/
}
