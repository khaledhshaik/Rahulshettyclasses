package practicejava;

import java.util.Scanner;

public class Swappingtwonumbers_using_thirdnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter x value=");
		x=input.nextInt();
		System.out.println("Enter y value=");
		y=input.nextInt();
		
		System.out.println("Befpre swapping\nx="+x+"\ny="+y+"");
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping\nx="+x+"\ny="+y+"");

	}

}
