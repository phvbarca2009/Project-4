package Bai3andBai4;
import java.util.Scanner;
public class Min3numbers {
	  public static void main(String[] args) {
	       int a, b, c, min;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("a = ");
	       a = sc.nextInt();
	       System.out.println("b = ");
	       b = sc.nextInt();
	       System.out.println("c = ");
	       c = sc.nextInt();
	       min = a;
	       if(b < min) {
		        min = b;
	       }
	       if (c < min) {
		        min = c;
	       }
	       System.out.println("Min = " + min);
      }
}
