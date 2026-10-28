package constructor;

public class Constructor {
	
	public Constructor() {
		System.out.println("constructor is running");
		
	}
	
	public Constructor(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con=new Constructor();
		Constructor con1=new Constructor(10);
	}

}
