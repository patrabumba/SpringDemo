package com.javabrains.innerbean;

public class InnerBeanTriangle {

	private InnerBeanPoint pointA;
	private InnerBeanPoint pointB;
	private InnerBeanPoint pointC;
	
	public InnerBeanPoint getPointA() {
		return pointA;
	}
	public void setPointA(InnerBeanPoint pointA) {
		this.pointA = pointA;
	}
	public InnerBeanPoint getPointB() {
		return pointB;
	}
	public void setPointB(InnerBeanPoint pointB) {
		this.pointB = pointB;
	}
	public InnerBeanPoint getPointC() {
		return pointC;
	}
	public void setPointC(InnerBeanPoint pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY()+")");
		System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY()+")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY()+")");
	}
}
