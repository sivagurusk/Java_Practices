package oops;

public class Secondclass extends Abstraction {
	private String name;
	private String feedback;
	
	public void Employee(String name,String feedback) {
		this.name=name;
		this.feedback=feedback;
	}
	
	public void Display(String name, String feedback) {
		System.out.println("Name : "+this.name);
		System.out.println("Feedback : "+this.feedback);
	}

	
}
