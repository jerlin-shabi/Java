import java.util.Scanner;
public class ConceptString {
    public static void main(String args[]){
        String s="vesam";
        Scanner sc = new Scanner(System.in);
        String rev="";
    for(int i=s.length()-1;i>=0;i--){
        rev+=s.charAt(i);
    }  System.out.println(rev); }
}
