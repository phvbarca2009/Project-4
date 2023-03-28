package Bai14;
import java.util.Scanner;
public class DateTime {
      public static void main(String[] args) {
    	  int day, month, year;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter day: ");
    	  day = sc.nextInt();
    	  System.out.println("Enter month: ");
    	  month = sc.nextInt();
    	  System.out.println("Enter year: ");
    	  year = sc.nextInt();
    	  if (year>=1000 && year <=9999) {
    		  if (month>=1 && month<=12) {
    			  if ((day>=1 && day<=31) && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)) {
    				  System.out.println("Date is valid");
    			  }
    			  else if ((day>=1 && day<=30) && (month==4 || month==6 || month==9 || month==11)) {
    				  System.out.println("Date is valid");
    			  }
    			  else if ((day>=1 && day<=28) && month==2) {
    				  System.out.println("Date is valid");
    			  }
    			  else if (day==29 && month==2 && (year%400==0 || (year%4==0 && year%100!=0))) {
    				  System.out.println("Date is valid");
    			  }
    			  else {
    				  System.out.println("Day is invalid");
    			  }		  
    		  }
    		  else {
    			  System.out.println("Month is invalid");
    		  }
    	  }
    	  else {
    		  System.out.println("Year is invalid");
    	  }
      }
}
