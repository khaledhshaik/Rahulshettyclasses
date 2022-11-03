package strings;

public class Childdemo extends Parentdemo{
	String name="QAAcademy";
	
	public Childdemo() {
		super();    // this should be always the first line
		System.out.println("I am child class constructor");
	}
	
	public void getstringdata() {
		System.out.println(name);
		System.out.println(super.name);
	    }
	
	public void getdata() {
		System.out.println("I am in child class");
		super.getdata();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Childdemo cd=new Childdemo();
		    cd.getstringdata();
		    cd.getdata();
	}
}              
