package s;

public class IfElse {
	public static void main(String arg[]) {
		int HouseRent = 10000;
		if(HouseRent>10000) {
			System.out.println("NO facilitiy in the house");
		}
		else if(HouseRent>20000) {
			System.out.println("No Water facility And Available in electricity");
		}
		else if(HouseRent>30000) {
			System.out.println("Its have to stroage of water limitd time only the water available And Electricity");
			
		}
		else if(HouseRent>40000) {
			System.out.println("The is is better comapare to previous one");
			
		}
		else if(HouseRent>50000) {
			System.out.println("Slightly modify the house compared to previous one");
		}
		else if(HouseRent>60000) {
			System.out.println("It have Car parking");
		}
		else if(HouseRent>70000) {
			System.out.println("It have Car parking and terace");
		}
		else if(HouseRent<800000) {
			System.out.println("Its have higher facility all facility in  our compound");
		}
		
	}
}
