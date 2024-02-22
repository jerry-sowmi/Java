package s;
import java.util.Scanner;

public class singleArray
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		int empid[][] = new int[2][2];
		
		for(i=0;i<=10;i++)
		{
			for(j=0;j<=5;j++)
			{
				System.out.println("enter emp id");
				empid[i][j] = sc.nextInt();
				System.out.println(+i+j);
			}
		}
		
	}
}