package com.app.model;

import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;

public class StudentModel {
 
	private boolean Status;
	private String User_Id;
	private String Email_Id;
	private String College_Role_Numbers;
	private ObjectArraySerializer Array_For_Numbers;
	private ObjectArraySerializer Array_For_Alphabets;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(boolean status, String user_Id, String email_Id, String college_Role_Numbers,
			ObjectArraySerializer array_For_Numbers, ObjectArraySerializer array_For_Alphabets) {
		super();
		Status = status;
		User_Id = user_Id;
		Email_Id = email_Id;
		College_Role_Numbers = college_Role_Numbers;
		Array_For_Numbers = array_For_Numbers;
		Array_For_Alphabets = array_For_Alphabets;
	}
	@Override
	public String toString() {
		return "StudentModel [Status=" + Status + ", User_Id=" + User_Id + ", Email_Id=" + Email_Id
				+ ", College_Role_Numbers=" + College_Role_Numbers + ", Array_For_Numbers=" + Array_For_Numbers
				+ ", Array_For_Alphabets=" + Array_For_Alphabets + "]";
	}
	
	
	
}
