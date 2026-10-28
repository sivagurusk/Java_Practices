package practice;

import java.util.*;
public class Employee {
	//int->float->double
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String empname=in.nextLine();
		System.out.println("Enter the id: ");
		int empid=in.nextInt();
		
		System.out.println("Enter the shift time: ");
		String shifttime=in.next();
		in.nextLine();
		System.out.println("Enter the salary: ");
		double salary=in.nextDouble();
		in.nextLine();
		System.out.println("Enter the date of joining: ");
		String dateofjoin=in.nextLine();
		System.out.println("Enter the name: "+empname+"\n"+"Enter the id: "+empid+"\n"+"Enter the shift time: "+shifttime+"\n"+"Enter the salary: "+salary+"\n"+"Enter the date of join: "+dateofjoin);
		
	}

}
