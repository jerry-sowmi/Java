package s;
import java.util.Scanner;

public class Amstrong {
	int i,n;
	Scanner sc= new Scanner(System.in);
	void get1()
	{
		int t;
		int remainder=0,sum=0;
		System.out.println("Enter the T value is::");
		t=sc.nextInt();
		remainder = t%10;
		sum = sum+remainder;
		t = t/10;
		System.out.println("Your sume is::"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amstrong c = new Amstrong();
		c.get1();
		

	}

}
