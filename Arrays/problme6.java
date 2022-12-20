import java.util.*;

public class problme6 {
    // fucntion
    public static int indexPosition(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

        System.out.printf("Index position of %d is: %d", 25, indexPosition(myArray, 25));
        System.out.printf("Index position of %d is: %d", 77, indexPosition(myArray, 77));
    }
}