package strings;

public class reversestring {

	public static void main(String[] args) {
		
		String q="AVIVA";
		String t="";
		for(int i=q.length()-1; i>=0;i--)
		{
			t=t+q.charAt(i);
			//System.out.println(t);
		}
        System.out.println(t);
        
        if (q.equals(t))
           { System.out.println("It Is Palindrome");
	       }
        else { System.out.println("It Is not Palindrome");
             }
      }
	
}