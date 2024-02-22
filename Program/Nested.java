package s;

public class Nested {
	void nestedforloop()
	{
		int i,j,n,m;
		for(i=0; i<2; i++)
		{
			System.out.println("I value is::"+i);
			for(j=0;j<3;j++)
			{
				System.out.println("j value is::" +j);
			}
		
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested t1=new Nested();
		t1.nestedforloop();
				

	}

}
