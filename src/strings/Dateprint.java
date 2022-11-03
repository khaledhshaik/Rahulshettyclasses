package strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/YYYY ");
		SimpleDateFormat sd=new SimpleDateFormat("MM/d/YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	}

}
