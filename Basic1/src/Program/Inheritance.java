package Program;
class A1
{
	void m1()
	{
		System.out.println("m1 in a");
	}
}
class B extends A1
{
	void m2()
	{
		System.out.println("m2 in b");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("m3 in c");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();
	}

}
