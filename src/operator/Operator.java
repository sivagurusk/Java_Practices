package operator;
import java.util.*;
public class Operator {
	double salary=10000;
	
	public void Lastmonth() {
		System.out.println("Last month salary: "+salary);
	}
	
	public void Salary() {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the current salary: ");
		double newSalary=in.nextDouble();
		System.out.println(newSalary+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator opt=new Operator();
		opt.Lastmonth();
		opt.Salary();

	}

}
