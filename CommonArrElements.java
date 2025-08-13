import java.util.*;

public class CommonArrElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Set<Integer> common = new LinkedHashSet<>(); // Keeps order, avoids duplicates
        for (int x : arr1) {
            for (int y : arr2) {
                if (x == y) {
                    common.add(x);
                    break;
                }
            }
        }

        System.out.println("Common elements: " + common);
        sc.close();
    }
}
