package com.homeassignments;
import java.util.Scanner;
class converting
{
	float speed,dist,time;
	float time(float dist,float speed)
	{
		time=dist/speed;
		return time;
	}
	float dist (float speed,float time)
	{
		dist=speed*time;
		return dist;
	}
	float speed(float dist,float time)
	{
		speed=dist/time;
		return speed;
	}
}
public class HA1SpeedTest 
{	
	public static void main(String[] args) 
	{
		int s;
		float speed,dist,time;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter what you want to do: ");
		System.out.println("1) for speed finding");
		System.out.println("2) for time finding");
		System.out.println("3) for dist finding");
		s=s1.nextInt();
	         converting c1=new converting();
	         switch(s)
	         {
	         default:{
	        	 System.out.println("Enter something logical");
				break;
				}
			case 1:
				System.out.print("enter dist: ");
				dist=s1.nextFloat();
				System.out.print("enter time: ");
				time=s1.nextFloat();
				speed = c1.speed(dist,time);
				{
					System.out.println("Speed = "+speed);
				break;
				}
			case 2:
				System.out.print("enter dist: ");
				dist=s1.nextFloat();
				System.out.print("enter speed: ");
				speed=s1.nextFloat();
				 time= c1.time(dist,speed);
				{System.out.println("Time = "+time);
				break;}
			case 3:
				System.out.print("enter time: ");
				time=s1.nextFloat();
				System.out.print("enter speed: ");
				speed=s1.nextFloat();
				 dist= c1.dist(speed,time);
				{System.out.println("Distance = "+dist);
				break;}
	         }
		}
}

