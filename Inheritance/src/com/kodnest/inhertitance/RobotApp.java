package com.kodnest.inhertitance;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r=new Robot();
		r.talk();
		r.walk();
		r.charge();
		System.out.println("============================");
		
		ChefRobot cr=new ChefRobot();
		cr.talk();
		cr.walk();
		cr.charge();
		cr.cook();
		System.out.println("============================");
		
		DoctorRobot dr=new DoctorRobot();
		dr.talk();
		dr.walk();
		dr.charge();
		dr.surgery();
		System.out.println("============================");
		
		TeacherRobot tr=new TeacherRobot();
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		
		

	}

}
