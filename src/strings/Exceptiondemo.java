package strings;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		int y=0;
		
		try {
			int k=i/y;
			System.out.println(k);
			//int arr[]=new int[5];
			//System.out.println(arr[7]);
		    }
		
		catch(ArithmeticException ae) {
			System.out.println("I catched Arithmetic Exception");
		    }
		
		catch(IndexOutOfBoundsException ets) {
			System.out.println("I catched IndexOutOfBoundsException");
		    }
		
		catch(Exception e) {
			System.out.println("I cathed an error/exception");
		   }

	}

}
