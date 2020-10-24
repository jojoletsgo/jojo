
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {

	public static void main(String[] args) throws Throwable {
		//input year&month
		System.out.println(" please input year&month:");
		Scanner sc = new Scanner(System.in);
		
		//
		String yearmonth = sc.next();
		String year = yearmonth.substring(0,4);
		System.out.println(year);
		String month = yearmonth.substring(4);
		System.out.println(month);
		//
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");			
		
		//
		Calendar c = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date dateT = null;
		dateT = f.parse(year+"-"+month+"-"+"01");
		c.setTime(dateT);
		int w = c.get(Calendar.DAY_OF_WEEK) - 1; // 
		//

//		c.set(Calendar.YEAR, Integer.parseInt(year));
//		c.set(Calendar.MONTH, Integer.parseInt(month)-1);

		int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println("days"+days);
		//
		for (int j=1;j<=w;j++) {
			System.out.print("    ");
		}
		for (int i=1,k=w+1;i<=days;i++,k++) {

//			System.out.print(" "+i+" ");
			String displayDay = " "+String.valueOf(i);
			System.out.print(flushLeft(' ',4,displayDay));
			if (k%7==0) System.out.println();
			
		}
		
	}
	
	 public static String flushLeft(char c, long length, String content){             
	       String str = "";     
	       long cl = 0;    
	       String cs = "";     
	       if (content.length() > length){     
	            str = content;     
	       }else{    
	            for (int i = 0; i < length - content.length(); i++){     
	                cs = cs + c;     
	            }  
	          }  
	        str = content + cs; 
	        System.out.print("    ");
	        return str;      
	   } 

}
