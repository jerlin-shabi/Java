import java.util.Scanner;
public class ReturnState {
    public static int  square(int num){
        return num * num;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sq=sc.nextInt();
    System.out.println(square(sq));
    }
}
