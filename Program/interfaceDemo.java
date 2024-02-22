package s;
interface B1
{
	int pid=1001;
	void get1();
}
interface B2 extends B1
{
	String pname="Apple";
	void get2();
	}
class D implements B2
{
	public void get1()
	{
		System.out.println("Your product id is::"+pid);
		}
	public void get2()	
	{
		System.out.println("Your Name is::"+pname);
		}
	public void get3()
	{
		System.out.println("It is Normal method");
	}
	}

public class interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	D f1=new D();
	f1.get1();
	f1.get2();
	f1.get3();

	}

}
