package viettel.one.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTest {

	public static void main(String[] args) {
		Date d = new Date(1900-1900, 0, 1);
		System.out.println(d);
		System.out.println(d.getTime());
		
		long l = -2209014000000l;
		Date x = new Date(l);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(x));
	}

}
