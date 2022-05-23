package com.assignment_abstraction;

abstract class ObjectMovement
{
	int speed;
	static String direction="forward";
	abstract void move(int newspeed);
	public void setSpeed(int speed)
	{
		this.speed = speed;
		
	}
	public int getSpeed() 
	{
		return speed;
		
	}
		
}

class Ballobj extends ObjectMovement
{
	public void move(int s) 
	{
		speed=s;
		System.out.println("Ball rolling with Speed "+s+ "on ground in "
		+ObjectMovement.direction+" Direction");
	}
	
	public void showColor() 
	{
	System.out.println("Ball is in red color");	
	}
}
class Car extends ObjectMovement
{
	public void move(int s) 
	{
		speed=s;
		System.out.println("Car is moving/Running with Speed "+s+ "on Road "
		+ObjectMovement.direction+" Direction");
	}
	
	public void showColor() 
	{
	System.out.println("Car is in blue color");	
	}
}


public class Ball 
{
	
	public static void main(String[] args) 
	{
		ObjectMovement b;
		b=new Car();
		b.setSpeed(150);
		System.out.println("This is initial speed of car is : "+b.getSpeed()+"km/hr");
		b.move(50);
		
		b=new Ballobj();
		b.setSpeed(10);
		System.out.println("\nThis is initial speed  of ball is : "+b.getSpeed()+"km/hr");
		b.move(5);
		
	}

}
