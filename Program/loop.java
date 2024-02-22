package s;
import java.util.Scanner; 

public class loop {
	int i,j,n;
	 
	Scanner sc=new Scanner(System.in);
	void forloop()
	{
		for(i=0;i<=6;i++)
		{
			System.out.println("I value is::" +i);
		}
	}
		void forloopodd() 
		{
			System.out.println("Enter the n value::");
			 n=sc.nextInt();
			 for(i=0;i<=n;i++)
			 {
			 
			 
				 if(i%2==0)
				 {
					 
					 System.out.println("even is::" +i);
				 }
				 else 
				 {
				 System.out.println(" odd is::" +i);
				 
				 
			 }
			 }
	}
		void forcalc()
		{
			System.out.println("Enter n value");
			n=sc.nextInt();
			int sum=0,multi=1;
			for(i=0;i<=n;i++);
			{
				if(i%2==0)
				{
					sum=sum+i;
					System.out.println("even value:"+sum);
				}
				else
				{
					multi=multi*i;
					System.out.println("odd value:"+multi);
				}
			}
			
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop t1 = new loop();
		t1.forloop();
		t1.forloopodd();
		t1.forcalc();

	}

}     