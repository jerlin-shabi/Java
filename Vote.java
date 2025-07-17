import java.util.Scanner;
class Vote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        String citizen=sc.next();

        if(age>=18 && citizen.equals("indian")){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}