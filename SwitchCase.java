import java.util.Scanner;
public class SwitchCase
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    //int a=num.nextInt();
	    //int b=num.nextInt();
	    int month=num.nextInt();
		switch (month) {
		    case 1:
		          System.out.println("jaunuary");  
		   		  System.out.println("31");
		   		  break;
            case 2:
		          System.out.println("febrauary");  
		   		  System.out.println("28");
		   		  break;
             case 3:
		          System.out.println("march");  
		   		  System.out.println("31");
		   		  break;
		   	case 4:
		          System.out.println("april");  
		   		  System.out.println("30");
		   		  break;
            case 5:
		          System.out.println("may");  
		   		  System.out.println("31");
		   		  break;
             case 6:
		          System.out.println("june");  
		   		  System.out.println("30");
		   		  break;
		   	case 7:
		          System.out.println("july");  
		   		  System.out.println("31");
		   		  break;
            case 8:
		          System.out.println("august");  
		   		  System.out.println("31");
		   		  break;
             case 9:
		          System.out.println("september");  
		   		  System.out.println("30");
		   		  break;
		   	case 10:
		          System.out.println("october");  
		   		  System.out.println("31");
		   		  break;
            case 11:
		          System.out.println("november");  
		   		  System.out.println("30");
		   		  break;
             case 12:
		          System.out.println("december");  
		   		  System.out.println("31");	
		   		  break;
		   }
		}
}
