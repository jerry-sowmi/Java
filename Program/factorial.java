package s;
import java.util.Scanner;


public class factorial {
	Scanner sc=new Scanner(System.in);
	void factorialS2()
	{
		System.out.println("Enter n value");
		int i,n,fact=1;

		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
			System.out.println("Enter fact value"+fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial s1=new factorial();
		s1.factorialS2();
		

	}

}
