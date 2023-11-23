package binod;
import java.util.Scanner;

public class if_else_party_eligibility {
	public static void main (String args[]) {
		
		
		int boyage,girlage;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your age boy");
		boyage = a.nextInt();
		System.out.println("Enter your age Girl");
		girlage = a.nextInt();
		
		/*if (boyage>=21 && girlage>=18)
			System.out.println("you are eligible:");
		else
			System.out.println("you are not eligible:");*/
		
		
		if (boyage<=21)
			System.out.println("you are eligible:");
		else
			System.out.println("you are not eligible:");
		
		if (girlage<=18)
			System.out.println("you are eligible:");
		else
			System.out.println("you are not eligible:");

	
	}
	

}
