package accessModifier;
class A {
	public long number=927373883403l;
	public boolean isCall=true;
	public void meths(long number, boolean isCall) {
		System.out.println(number+" "+isCall);
	}
}

public class PublicClass extends A{
	
	public void meth() {
		System.out.println(number+" "+isCall);
	}
	public static void main(String[] args) {
		PublicClass b=new PublicClass();
		b.meth();
		b.meths(734653l, false);
	}
}
