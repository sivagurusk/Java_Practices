package loop_condition;
import java.util.*;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int marks=in.nextInt();
		
		if(marks>=91 && marks<=100) {
			System.out.println("Grade O..");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("Grade A+..");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("Grade A..");
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("Grade B+..");
		}
		else if(marks>=51 && marks<=60) {
			System.out.println("Grade B..");
		}
		else if(marks>=0 && marks<=50) {
			System.out.println("Grade U or Fail..");
		}
		else {
			System.out.println("Invalid input..");
		}
		
		System.out.println("Enter the age : ");
		int age=in.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible to voting...");
		}
		else {
			System.out.println("Not Eligible to voting...");
		}
	}

}
