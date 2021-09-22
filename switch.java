package practiceCodes;
import java.util.Scanner;

public class add
{

	public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Pick one : H1\t2. Hey\t2. hello\t");
		choice= sc.nextInt();
		  switch(choice)
		  {
		  case 1:System.out.println("you said hi");
		break;
		  case 2: System.out.println("you said Hey");
		break;
		  case 3:System.out.println("you said Hello");
		break;
		  default:System.out.println("Invalid choice");
		  }

	  }

 }
