package com.klu.StudentInfo.StudentInfo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentPojo {
@Id
private int sregno;
@Column
private String name;
@Column
private String dob;
@Column
private String email;
@Column
private String address;
@Column
private String course;
public int getSregno() {
	return sregno;
}
public void setSregno(int sregno) {
	this.sregno = sregno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "StudentPojo [sregno=" + sregno + ", name=" + name + ", dob=" + dob + ", email=" + email + ", address="
			+ address + ", course=" + course + ", getSregno()=" + getSregno() + ", getName()=" + getName()
			+ ", getDob()=" + getDob() + ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress()
			+ ", getCourse()=" + getCourse() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
}
