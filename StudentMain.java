package com.klu.StudentInfo.StudentInfo;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		StudentDAO d = new StudentDAO();
		StudentPojo s = new StudentPojo();
		switch(ch) {
		case 1:
			System.out.println("Enter your regno:");
			int sregno = sc.nextInt();
			System.out.println("Enter your name:");
			String name = sc.next();
			System.out.println("Enter your dob:");
			String dob = sc.next();
			System.out.println("Enter your email:");
			String email = sc.next();
			System.out.println("Enter your address:");
			String address = sc.next();
			System.out.println("Enter your course:");
			String course = sc.next();
			s.setSregno(sregno);
			s.setName(name);
			s.setDob(dob);
			s.setEmail(email);
			s.setAddress(address);
			s.setCourse(course);
			int i = d.save(s);
			if(i>0) {
				System.out.println("Insertion successful");
			}
			else {
				System.out.println("Insertion failed");
			}
			break;
		case 2 :
			int ua = d.updateAddress();
			if(ua>0) {
				System.out.println("Updation successful");
			}
			else {
				System.out.println("Updation failed");
			}
			break;
		case 3: 
		    int uc = d.updateCourse();
		    if(uc>0) {
				System.out.println("Updation successful");
			}
			else {
				System.out.println("Updation failed");
			}
		    break;
		case 4: 
		    int del = d.delete();
		    if(del>0) {
				System.out.println("Deletion successful");
			}
			else {
				System.out.println("Deletion failed");
			}
		    break;
		case 5 : 
			d.retrievebyID();
			break;
		case 6 : 
			d.retrieveAll();
			break;
	    default : 
	    	System.out.println("Enter the correct choice");
	    	break;
		}

	}

}
