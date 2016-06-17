package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	private double length;
	private double leavesEaten;

	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}
	
	public boolean equals(Butterpillar b) {
		if((b.length == this.length) && (b.leavesEaten == this.leavesEaten)){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		String l = String.valueOf(this.length);
		String lE = String.valueOf(this.leavesEaten);
		return "(" + l + ", " + lE + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
