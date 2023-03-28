package Bai16;
import java.util.Scanner;
public class Student {
     public static void main(String[] args) {
    	 double score;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Score: ");
    	 score = sc.nextDouble();
    	 if (score < 5.0) {
    		 System.out.println("Bad");
    	 }
    	 else if ((score >= 5.0) && (score < 7.0)) {
    		 System.out.println("Average");
    	 }
    	 else if ((score >= 7.0) && (score < 8.0)) {
    		 System.out.println("Good");
    	 }
    	 else if ((score >= 8.0) && (score < 9.0)) {
    		 System.out.println("Very good");
    	 }
    	 else if ((score >= 9.0) && (score <= 10.0)){
    		 System.out.println("Excellent");
    	 }
    	 else {
    		 System.out.println("N/A");
    	 }
     }
}
