import java.util.Scanner;
public class Conditions
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    int a=num.nextInt();
	    int b=num.nextInt();
		if (a<6){
		    System.out.println(a);
		}
		else if (a==b){
		    System.out.println(b);
		}
		else{
		    System.out.println("nothing");

		}
	}
}
