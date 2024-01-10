package com.kodnest.hibernate5.CarsAndFriends.CarsAndFriends;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Friend {
	
	@Id
	int friendId;
	String friendName;
	int frinedSalary;
	
	@OneToOne
	Cars id;

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(int friendId, String friendName, int frinedSalary, Cars id) {
		super();
		this.friendId = friendId;
		this.friendName = friendName;
		this.frinedSalary = frinedSalary;
		this.id = id;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public int getFrinedSalary() {
		return frinedSalary;
	}

	public void setFrinedSalary(int frinedSalary) {
		this.frinedSalary = frinedSalary;
	}

	public Cars getId() {
		return id;
	}

	public void setId(Cars id) {
		this.id = id;
	}
	
	

}
