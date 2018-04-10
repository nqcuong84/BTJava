package String;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai10 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		Date t=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
		System.out.println(sdf.format(t));
	}

}
