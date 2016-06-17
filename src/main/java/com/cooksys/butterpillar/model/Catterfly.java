package com.cooksys.butterpillar.model;

public class Catterfly {
	
	private double wingspan;
	private double weight;

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean equals(Catterfly c) {
		if((c.wingspan == this.wingspan)&&(c.weight == this.weight)){
			return true;
		}else
		return false;
	}
	
	@Override
	public String toString() {
		String we = String.valueOf(this.weight);
		String wi = String.valueOf(this.wingspan);
		return "(" + we + ", " + wi + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
