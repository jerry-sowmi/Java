package s;
class B
{
	int empid=1001;
	void get1()
	{
		System.out.println("This is base class");
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("This is derived"+empid);
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}
