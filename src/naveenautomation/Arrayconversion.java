package naveenautomation;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Arrayconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// printing string using join method
		String[] arr= {"t","r","y"};
		
		 String join=String.join("", arr);
		//String join=String.join("/", arr);
		//String join=String.join(";", arr);
		//String join=String.join("|", arr);
		
		System.out.println(join);
		
		// printing string using array stream list
		String join1=Arrays.asList("t","r","y","i","n","g")
		               .stream()
		               .collect(Collectors.joining(""));
		System.out.println(join1);
		
		

}
}
