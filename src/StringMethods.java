
public class StringMethods {

	
	public static String capitalize(String a) {
		a = a.toLowerCase();
		String a1 = a;
		a1 = a1.toUpperCase();
		a = a.replace(a.charAt(0), a1.charAt(0));
		return a;
	}
	
	public static int wheresWaldo(String a) {
		a = a.toLowerCase();
		int t = a.indexOf("waldo");
		return t;
	
	}
	
	public static String firstThingsFirst(String a, String b) {
		String c;
		if ((a.toLowerCase()).compareTo((b.toLowerCase()))>=0) {
			c = (b + " " + a);
		}else { c = (a + " " + b);}
		return c;
		
	}
	
	public static String reverse(String a) {
		
		String r="";
		String ar = a;
		char[] c = a.toCharArray();
		char[] b = ar.toCharArray();
		int t =0;
		for (int i=a.length()-1; i >=0; i--) {
		
			c[t] =b[i];
				++t;
		
	}

		for(int y=0; y < c.length; y++) {
			r = r+c[y];
		}
		return r;
		
	}
	
	public static void soLong(String a, String b) {
		if(a.length()>b.length()) {
			System.out.println(a);
		} else if(b.length()>a.length()) {
			System.out.println(b);
		} else {
			System.out.println(a);
			System.out.println(b);
		}
		
	}
	
	public static String afterMath(String a) {
		String am;
		if (a.toLowerCase().contains("math")) {
		am = a.substring(a.toLowerCase().indexOf("math"));
		
		} else {
			am = "dud";
		}
		return am;
	}
	
	public static void letterize(String a) {
		for(int i = 0; i<a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
	}
//	
	public static String camelCase(String a) {
		a = a.toLowerCase();
		String c = "";
		String b; 
		for (int i =0; i<a.length(); i++) {			
			if(a.charAt(i) == ' ') {
				b = a.substring(i+1, i+2);
				b= b.toUpperCase();	
				c = (c + b); 
			}else if (i>0 && a.charAt(i-1) == ' ') {
				continue;
			}else {
				 c = c + a.charAt(i); 
			}
		}
		return c;
	}
}
