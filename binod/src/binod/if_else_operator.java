package binod;
import java.util.Scanner;


public class if_else_operator {
	
public static void main(String args[]) {	
	Scanner a = new Scanner(System.in);
	double age;
	System.out.println("ENTER YOUR AGE:");
	age = a.nextDouble();
	
	if (age >=18) 
	System.out.println("ABLE TO VOTE:");
	
	else 
		System.out.println("NOT ABLE TO VOTE:");
	
	
}
	

}
