import java.util.Scanner;
public class JavaMethods {
    static void integer(int n){
        System.out.println("integer is:"+(n+n));
    }
    public static void display(){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        integer(n);
    }
    public static void main(String args[]){
        display();
    }
}
