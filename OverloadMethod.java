public class OverloadMethod {
    static int subtract(int a, int b){
        System.out.println("ithu first sub");
        return a-b;
    }
    static String subtract(String a, String b,String c){
        System.out.println("ithu second Add");
        return a+b+c;
    }
    public static void main(String args[]){
        
        System.out.println(subtract(1,2));
        System.out.println(subtract("jerlin"," ","shabi"));

    }   
}
