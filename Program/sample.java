package s;
import java.util.Scanner;


public class sample {
	int a;
	Scanner sc= new Scanner(System.in);
	void rent()
	{
		System.out.println("Enter the value::");
		a=sc.nextInt();
		if(a<2000) {
			System.out.println("not bad");
		}
		else if(a>200) {
			System.out.println("WOrst");
		}
		else {
			System.out.println("Beatuiful");
		}
     }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample S1 = new sample();
		S1.rent();
				

	}

}
