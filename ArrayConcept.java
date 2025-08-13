import java.util.Scanner;

class ArrayConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1=new int[10];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();

        }System.out.println(arr1[1]);
    }
}
