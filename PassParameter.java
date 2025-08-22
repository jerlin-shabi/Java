import java.util.Scanner;
public class PassParameter {
    public static void square(int n){
        System.out.print(n*n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        square(n);
    }
}
