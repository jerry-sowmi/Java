 package s;
import java.util.Scanner;
public class whileloop1 {
	int i,n;
	Scanner sc = new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value::");
		n=sc.nextInt();
	}
	void get2()
	{
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileloop1 t1 = new whileloop1();
		t1.get1();
		t1.get2();

	}

}
