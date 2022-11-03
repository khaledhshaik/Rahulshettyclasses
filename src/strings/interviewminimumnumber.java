package strings;

public class interviewminimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 5 8
		 * 9 7 3
		 * 1 4 0 
		 */
		int a[][]={{2,5,8},{9,7,3},{1,4,0}};
		int max=a[0][0];
		
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
		    {
			  if (a[i][j]>max)
			  {
				  max=a[i][j];
			  }
		    }
		}
		
		 System.out.println(max);
	}
}
