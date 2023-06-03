import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;



public class DatePra {
	
	
	public static void main(String [] args) throws AgeIsNotGood, ParseException 
	{
		float f=7.8f;
		double dob=3.354;
		int i=19;
		
		String rk="love";
		
		String premrk=String.valueOf(rk);
		
		String premf=String.valueOf(f);
		String premd=String.valueOf(dob);
		String premi=String.valueOf(i);

		
		
		System.out.println(premf);
		System.out.println(premd);
		System.out.println(premi);
		System.out.println(premrk);
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		java.util.Date date1 = simpleDateFormat.parse("1998-07-30");
		System.out.println(date1);
		
		
		String d=date1.getDate() +"-"+ date1.getMonth()+"-"+date1.getYear();
		System.out.println(d);
		int choice=date1.getMonth();
		
		String s1=getMonthByMonthNumber(choice);
				
		
		String d1=date1.getDate() +"-"+ s1+"-"+date1.getYear();
		System.out.println(d1);
		
		
		String pattern1 = "yyyy-MM-dd HH:mm:ss.SS";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern);
		java.util.Date date11 = simpleDateFormat.parse("2022-09-06T16:59:29.861");
		System.out.println(date11);
		System.out.println(date11.getTime());
		
		
		
		
		
	}
	
	
	public static String getMonthByMonthNumber(int  choice)
	{
		
		String result="";
		switch(choice)
		{
		case 1:
		{
			result+="JAN";
			break;
		}
		case 2:
		{
			result+="FEB";
			break;
		}
		case 3:
		{
			result+="MAR";
			break;
		}
		case 4:
		{
			result+="APR";
			break;
		}
		case 5:
		{
			result+="MAY";
			break;
		}
		case 6:
		{
			result+="JUN";
			break;
		}
		case 7:
		{
			result+="JUL";
			break;
		}
		case 8:
		{
			result+="AUG";
			break;
		}
		case 9:
		{
			result+="SEP";
			break;
		}
		case 10:
		{
			result+="OCT";
			break;
		}
		case 11:
		{
			result+="NOV";
			break;
		}
		case 12:
		{
			result+="DEC";
			break;
		}
		}
		return result;
	}

}
