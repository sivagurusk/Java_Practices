package accessModifier;

public class PrivateClass {
	private String name="Guru";
	private void method(String name) {
		System.out.println(name);	
	}
	private void methods() {
		System.out.println(name);	
	}
	
	public String getMethod() {
		return name;
	}
	
	public void setMethod(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		PrivateClass cls=new PrivateClass();
		
		cls.setMethod("Siva");
		cls.method("Sk");
		cls.methods();
	}
}
