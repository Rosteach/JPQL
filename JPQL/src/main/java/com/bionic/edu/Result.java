package com.bionic.edu;

public class Result {
	private int id; // from Merchant
	private String name; // from Merchant
	private double minSum; // from Merchant
	private double sum; // from Payments
	private double needToSend; // from Merchant

	public Result(){   }
	
	public Result(int id, String name, double minSum, double sum, double needToSend){
		this.id = id;
		this.name = name;
		this.minSum = minSum;
		this.sum = sum;
		this.needToSend = needToSend;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMinSum() {
		return minSum;
	}

	public void setMinSum(double minSum) {
		this.minSum = minSum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getNeedToSend() {
		return needToSend;
	}

	public void setNeedToSend(double needToSend) {
		this.needToSend = needToSend;
	}
	
}
