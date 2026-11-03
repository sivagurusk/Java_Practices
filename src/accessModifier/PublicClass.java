package accessModifier;
class A {
	
	public long number=927373883403l;
	public boolean isCall=true;
	A(long number,boolean isCall){
		this.number=number;
		this.isCall=isCall;
	}
	public void meths(long number, boolean isCall) {
		System.out.println(this.number+" "+this.isCall);
	}
}

public class PublicClass extends A{
	
	PublicClass(long number, boolean isCall) {
		super(number, isCall);
		// TODO Auto-generated constructor stub
	}
	public void meth() {
		System.out.println(number+" "+isCall);
	}
	public static void main(String[] args) {
		PublicClass b=new PublicClass(2344, true);
		b.meth();
		b.meths(734653l, false);
	}
}

//class A {
//	public long number=927373883403l;
//	public boolean isCall=true;
//	public void meths(long number, boolean isCall) {
//		System.out.println(number+" "+isCall);
//	}
//}
//
//class B extends A{
//	public long number=9273l;
//	public boolean isCall=false;
//	public void method() {
//		System.out.println(number+" "+isCall);
//	}
//}
//
//public class PublicClass extends B{
//	public static void main(String[] args) {
//		PublicClass b=new PublicClass();
//		b.method();
//		
//	}
//}