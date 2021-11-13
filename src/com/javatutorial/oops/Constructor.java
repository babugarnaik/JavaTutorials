package com.javatutorial.oops;

public class Constructor {
	private int x;
	private int y;
	private String z;
	public Constructor () {
		this.x=2;
		this.y=3;
		this.z="hi";
		}
	
	public Constructor(int x, int y, String z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}
	
	   

}
