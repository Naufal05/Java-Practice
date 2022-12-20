import java.util.Arrays;

public class problem8 {
    public static void main(String[] args) {
        int[] arr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int arr2[] = new int[10];

        System.out.println("Source Array:" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Copied Array :" + Arrays.toString(arr2));
    }

}
