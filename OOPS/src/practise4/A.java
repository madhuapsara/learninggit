package practise4;

public class A implements I1{
public void a1() {
	System.out.println("method-1");
}
public static void main(String[] args) {
	I1 i1=new A();
	i1.a1();
}
}
