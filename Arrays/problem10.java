public class problem10 {
    public static void main(String[] args) {
        int[] a = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int max = a[0]; // assume

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("MAx element is:" + max);
    }
}
