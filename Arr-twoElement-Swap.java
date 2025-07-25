import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
		    arr[i]=sc.nextInt();
		}for(int i=0;i<len-i;i+=2){
		    int temp =arr[i];
		    arr[i]=arr[i+1];
		    arr[i+1]=temp;
		}for(int i=0;i<len;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
