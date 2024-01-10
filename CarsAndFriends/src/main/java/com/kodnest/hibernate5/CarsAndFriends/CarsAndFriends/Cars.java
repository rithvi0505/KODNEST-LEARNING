package com.kodnest.hibernate5.CarsAndFriends.CarsAndFriends;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cars {
	
	@Id
	int carId;
	String carBrand;
	int cost;
	
	@OneToOne
	Friend f;
	
	public Cars(int carId, String carBrand, int cost, Friend f) {
		super();
		this.carId = carId;
		this.carBrand = carBrand;
		this.cost = cost;
		this.f = f;
	}

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Friend getF() {
		return f;
	}

	public void setF(Friend f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", carBrand=" + carBrand + ", cost=" + cost + ", f=" + f + "]";
	}
	
	

}
