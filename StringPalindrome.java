import java.util.Scanner;
public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str1=sc.next();

        StringBuilder sb =new StringBuilder(str1);
        sb.reverse();
        String rev = sb.toString();

        if(str1.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
