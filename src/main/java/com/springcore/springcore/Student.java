package com.springcore.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String StuentAddress;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StuentAddress=" + StuentAddress
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String stuentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StuentAddress = stuentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStuentAddress() {
		return StuentAddress;
	}
	public void setStuentAddress(String stuentAddress) {
		StuentAddress = stuentAddress;
	}

}
