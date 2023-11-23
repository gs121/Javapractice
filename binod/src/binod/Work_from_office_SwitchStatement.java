package binod;
import java.util.Scanner;

public class Work_from_office_SwitchStatement {
	
public static void main(String args[])
{
Scanner a = new Scanner(System.in);
System.out.println("Enter todays DATE;");
int day;
day = a.nextInt();

switch(day){
	
	case 1 :System.out.println("workfrom office");
	break;
	case 2 :System.out.println("workfrom HOme");
	break;
	case 3 :System.out.println("workfrom office");
	break;
	case 4 :System.out.println("workfrom Home");
	break;
	case 5 :System.out.println("workfrom office");
	break;
	
	default:System.out.println("Holiday");
	
}
}
}
