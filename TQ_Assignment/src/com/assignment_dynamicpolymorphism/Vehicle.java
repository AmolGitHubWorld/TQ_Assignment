package com.assignment_dynamicpolymorphism;

class Motor
{
	public void move() 
	{
		System.out.println("Motor moving");
	}
	
}
class Car extends Motor
{
	public void move() 
	{
		System.out.println("Car is moving on road");
	}
}
class Helicopter extends Motor
{
	public void move() 
	{
		System.out.println("Helicopter is moving up on Sky");
	}
}


public class Vehicle 
{

	public static void main(String[] args) 
	{
		Motor v = new Car();
		v.move();
		Motor v1 =new Helicopter();
		v1.move();
	}

}
