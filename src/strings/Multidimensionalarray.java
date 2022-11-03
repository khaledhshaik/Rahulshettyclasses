package strings;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// one way of declaring array
		int a[][]=new int[2][3];
		a[0][0]=5;
		a[0][1]=8;
		a[0][2]=4;
		a[1][0]=9;
		a[1][1]=2;
		a[1][2]=3;
		
		for(int i=0;i<2;i++)
		{
			for(int y=0;y<3;y++)
			{
			System.out.println(a[i][y]);
		    }
		}
		// simple way of defining multidimensional array
		int b[][]= {{2,4,7},{3,5,55}};
		System.out.println(b[1][2]);
		
	}

}
