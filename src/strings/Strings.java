package strings;

public class Strings {

	public static void main(String[] args) {
		//for string decaration beow
		String str="Payment $100 paid";
		System.out.println(str.charAt(8));
		
		//we can aso create object of the cass like below
		String str1=new String("Payments $100 paid");
		System.out.println(str1.charAt(6));
        System.out.println(str1.indexOf("$"));
        System.out.println(str1.substring(9));
	}

}
