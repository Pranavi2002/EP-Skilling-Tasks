package com.klu.StudentInfo.StudentInfo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class StudentDAO {
	Scanner sc = new Scanner(System.in);
public int save(StudentPojo s) {
	Config c = new Config();              
	int i= (Integer) c.session.save(s);
	c.t.commit();
	return i;
	}
public int updateAddress() {
	Config c = new Config();
	System.out.println("Enter your address:");
	String ad = sc.next();
	System.out.println("Enter your regno:");
	int r = sc.nextInt();
	Query q = c.session.createQuery("update StudentPojo set address=:ad where sregno=:r");
	q.setParameter("ad",ad);
	q.setParameter("r",r);
	int i = q.executeUpdate();	
	c.t.commit();
	return i;
	
}
public int updateCourse() {
	Config c = new Config();
	System.out.println("Enter your course:");
	String cr = sc.next();
	System.out.println("Enter your regno:");
	int r = sc.nextInt();
	Query q = c.session.createQuery("update StudentPojo set course=:cr where sregno=:r");
	q.setParameter("cr",cr);
	q.setParameter("r",r);
	int i = q.executeUpdate();
	c.t.commit();
    return i;
}
public int delete() {
	Config c = new Config();
	System.out.println("Enter your regno:");
	Query q = c.session.createQuery("delete from StudentPojo where sregno=:r");
	int r = sc.nextInt();
	q.setParameter("r",r);
	int i = q.executeUpdate();
	c.t.commit();
	return i;
}
public void retrievebyID() {
	Config c = new Config();
	System.out.println("Enter your regno:");
	int r = sc.nextInt();
	StudentPojo s = new StudentPojo();
	StudentPojo sp = (StudentPojo)c.session.get(StudentPojo.class,r);
	System.out.println(sp.getName());
	c.t.commit();
}
public void retrieveAll() {
	Config c = new Config();
	Query q = c.session.createQuery("from StudentPojo");
	List<StudentPojo> sp = q.list();
    for(StudentPojo s : sp) {
	System.out.println(s);
    }
}
}

