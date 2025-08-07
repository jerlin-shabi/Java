import java.util.Scanner;
public class RandomNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true){
        int sum = (int) (Math.random() * 10) + 1;
		if (sum==5)
		    break;
		System.out.println(sum);
	
}
}
}
