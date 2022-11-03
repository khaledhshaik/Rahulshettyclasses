 package strings;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// one way of declaring array
		int a[]=new int[7];
		a[0]=98;
		a[1]=23;
		a[2]=4;
		a[3]=56;
		a[4]=38;
		a[5]=29;
		a[6]=52;
		
		// another way of declaring array
		int b[]= {13,55,98,76,33,57,94,65,37};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
