package strings;

public class Thiskeyworddemo {
	
	int a=5;                            // this is global variable scope within the class level
	
	public void getdata() {
		int a=9;                        // this is local variable scope within the method level
		int b=a+this.a;                 // sum of local and global variable
		System.out.println(a);          // this prints local variable
		System.out.println(this.a);     // this prints global variable because of this keyword using
		System.out.println(b);
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyworddemo td=new Thiskeyworddemo();
		    td.getdata();
		
	}

}
