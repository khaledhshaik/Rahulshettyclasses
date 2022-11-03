package practicejava;

import java.util.Scanner;

public class Swappingtwonumbers_without_thirdnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter x value=");
		int x=input.nextInt();
		System.out.println("Enter y value=");
		int y=input.nextInt();
		
		System.out.println("Befpre swapping\nx="+x+"\ny="+y+"");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping\nx="+x+"\ny="+y+"");

	}

}
