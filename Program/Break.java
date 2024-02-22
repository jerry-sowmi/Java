package s;

public class Break {
	public static void main(String arg[]) {
		for(int i = 0; i<=15; i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
}
