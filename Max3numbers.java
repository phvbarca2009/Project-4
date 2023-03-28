package Bai3andBai4;
import java.util.Scanner;
public class Max3numbers {
      public static void main(String[] args) {
    	  int a, b, c, max;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("a = ");
    	  a = sc.nextInt();
    	  System.out.println("b = ");
    	  b = sc.nextInt();
    	  System.out.println("c = ");
    	  c = sc.nextInt();
    	  max = a;
    	  if(b > max) {
    		  max = b;
    	  }
    	  if (c > max) {
    		  max = c;
    	  }
    	  System.out.println("Max = " + max);
      }
}
