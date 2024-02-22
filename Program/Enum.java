package s;
enum Employee
{
	mohamed(31),azar(15),raja(24);
	private int age;
	Employee(int p)
	{
		age=p;
	}
	int getAge()
	{
		return age;
	}
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee p =Employee.mohammed;
		Employee p=Employee.azar;
		System.out.println(p.getAge());

	}

}
