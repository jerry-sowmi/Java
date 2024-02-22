package s;
class E
{
	int empid=200;
	
	void get1()
	{
		System.out.println("This is a base class");
	}
}
class F1 extends E
{
	String empname="Sowmi";
	void get2()
	{
		System.out.println("This is a derived class" +empname);
	}
}
class F2 extends F1
{
	String empwrk="Developer";
	void get3()
	{
		System.out.println("She is worked in" +empwrk);
	}
}
class F3 extends F2
{
	void get4()
	{
		System.out.println("This is a hierarchical");
	}
}
public class Hierarchicalinheitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F3 s1=new F3();
		s1.get1();
		s1.get2();
		s1.get3();
		s1.get4();
	}

}
