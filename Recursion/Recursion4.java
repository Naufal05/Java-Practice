// Print factorial of a number n

public class Recursion4 {
    public static int Calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fac_nm1 = Calcfactorial(n - 1);
        int fact_n = n * fac_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = Calcfactorial(n);
        System.out.println(ans);
    }
}
