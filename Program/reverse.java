package s;
import java.util.Scanner;
public class reverse {
	int i,n;
	Scanner sc = new Scanner(System.in);
	void get1()
	{
		int reverse = 0;
		System.out.println("Enter the n value::");
		n=sc.nextInt();
		while(n!=0)
		{
			reverse = reverse*10;
			reverse = reverse+n%10;
			n = n/10;
			
		}
			System.out.println("Reverse value is::"+reverse);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse t1 = new reverse();
		t1.get1();
		
		

	}

}
