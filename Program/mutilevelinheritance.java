package s;
class C
{
	int empid=100;
	void get1()
	{
		System.out.println("This is a base class");
	}
}
class A1 extends C
{
	String empname="Sowmi";
	void get2()
	{
		System.out.println("final derived class"+empname);
	}
}
class A2 extends A1
{
	void get3()
	{
		System.out.println("This is a multilevel");
	}
}

public class mutilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 f1=new A2();
		f1.get1();
		f1.get2();
		f1.get3();
		
		

	}

}
