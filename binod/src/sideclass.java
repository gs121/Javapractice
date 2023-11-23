import java.util.Scanner;

public class sideclass {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		To_call_Method c = new To_call_Method();
		System.out.println("What is your order");
		String b = a.nextLine();
		c.Simpleage(b);
	}

	

}
