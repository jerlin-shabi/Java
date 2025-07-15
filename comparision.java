import java.util.Scanner;
public class comparision
{
	public static void main(String[] args) {
	    Scanner num = new Scanner(System.in);
	    int a=num.nextInt();
	    int b=num.nextInt();
	    int c=num.nextInt();
	    String biggest = (a>b && a>c)? "a is bigger":
	    (b>c && c>a)? "b is bigger": "c is bigger";
	    System.out.println(biggest);
	}
}
