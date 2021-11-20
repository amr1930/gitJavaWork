package com.syntax.Class19_HW;

public class Shape {
	// Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
	// In circle class create a method to calculate the area of circle. Test your code

	    double radius;

	    Shape(double radius){
	     this.radius=radius;
	    }

	}

	class Circle extends Shape{
	    double area;
	    Circle(double radius){
	        super(radius);
	    }
	    void calculateArea(){
	        area=(radius*radius)*3.14;
	        System.out.println("The area of circle: "+area);
	    }
	public static void main(String[]args){

	    Circle circle=new Circle(10);
	    circle.calculateArea();

	}


	}