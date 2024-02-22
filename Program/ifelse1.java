package s;

import java.util.Scanner;

public class ifelse1 {
int salary;
Scanner Sc = new Scanner(System.in);
void get1()
{
	System.out.println("Enter the salary ::");
	salary = Sc.nextInt();
}
void get2()
{
	if(salary>=200)
	{
		System.out.println("GOOd");
		
	}
	else
	{
		System.out.println("Better");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelse1 obj1 = new ifelse1();
		obj1.get1();
		obj1.get2();

	}
}
