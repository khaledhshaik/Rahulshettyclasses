package practicejava;

import java.util.Scanner;

public class Primenumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean isPrime=false;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=in.nextInt();
		for(int i=2; i<=num/2; i++) {
		
			if(num%i ==0) {
				isPrime=true;
				break;
			}
		}
		if(!isPrime)
			System.out.println(num+"number is prime");
		else
			System.out.println(num+ "number is not a prime");
		

	}

}
