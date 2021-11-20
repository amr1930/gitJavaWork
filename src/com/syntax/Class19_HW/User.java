package com.syntax.Class19_HW;

public class User {
	// Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
	// Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
	// Print users name, mobile number and address in userDetails method. Test your code.


	    String name;
	    String mobileNo;

	    User(String name,String mobileNo) {
	        this.name = name;
	        this.mobileNo = mobileNo;

	    }

	}
	class UserInfo extends User{
	    String userAddr;

	    UserInfo(String name, String mobileNo, String userAddr) {
	        super(name,mobileNo);
	        this.userAddr=userAddr;
	    }
	     void userDetails() {
	         System.out.println("Name: "+name+"\n" + "Phone Number: " + mobileNo + "\nAddress: " + userAddr);
	     }

	    public static void main(String[]args){

	        UserInfo user1=new UserInfo("Ammar","(703) 123 456","789 any Ct");
	        user1.userDetails();
	    }

	}