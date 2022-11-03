package strings;

public class UsingConstructor {
	
	public UsingConstructor(){
		 
		System.out.println("i have an idea");
	 }
	 
    public UsingConstructor(int a, int b){
	  System.out.println("I am the parameterized constructor");
	  int c=a+b;
	  System.out.println(c);
     } 
    
    public UsingConstructor(String str){
  	  System.out.println(str);
       } 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingConstructor con=new UsingConstructor("Hello");
         UsingConstructor con2=new UsingConstructor(5,6);  
         UsingConstructor con3=new UsingConstructor();
	}
		
                
}