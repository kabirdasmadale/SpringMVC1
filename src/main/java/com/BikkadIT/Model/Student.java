package com.BikkadIT.Model;

public class Student {

	int Student_id;
	String Student_FName;
	String Student_LName;
	String Student_Address;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_FName() {
		return Student_FName;
	}
	public void setStudent_FName(String student_FName) {
		Student_FName = student_FName;
	}
	public String getStudent_LName() {
		return Student_LName;
	}
	public void setStudent_LName(String student_LName) {
		Student_LName = student_LName;
	}
	public String getStudent_Address() {
		return Student_Address;
	}
	public void setStudent_Address(String student_Address) {
		Student_Address = student_Address;
	}
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_FName=" + Student_FName + ", Student_LName="
				+ Student_LName + ", Student_Address=" + Student_Address + "]";
	}
	
	

}
