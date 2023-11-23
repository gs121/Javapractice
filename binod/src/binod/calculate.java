package binod;
import java.util.Scanner;


public class calculate {
	public static void main (String args[]) {
		
		Scanner b = new Scanner(System.in);
		double Num1 ,Num2 , Sum,Sub,Multi,Div;
		System.out.println("Enter 1st number:");
		Num1 = b.nextDouble();
		System.out.println("Enter 2nd number:");
		Num2 = b.nextDouble();
		Sum = Num1 + Num2;
		System.out.println("Sum of two no is" + Sum);
		
		
		//Substract
		
		System.out.println("Enter 1st number:");
		Num1 = b.nextDouble();
		System.out.println("Enter 2nd number:");
		Num2 = b.nextDouble();
		Sub = Num1 - Num2;
		System.out.println("Sub of two no is" +Sub);
		
		//Multi
		
		System.out.println("Enter 1st number:");
		Num1 = b.nextDouble();
		System.out.println("Enter 2nd number:");
		Num2 = b.nextDouble();
		Multi = Num1 * Num2;
		System.out.println("Multi of two no is" +Multi);
		
		
		//Div
		
		System.out.println("Enter 1st number:");
		Num1 = b.nextDouble();
		System.out.println("Enter 2nd number:");
		Num2 = b.nextDouble();
		Div = Num1 / Num2;
		System.out.println("Div of two no is" +Div);
		
	}

}
