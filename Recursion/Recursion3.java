//Print the sum of first n natural numbers

// sum =n*(n01)/2
//here use use by recursoin

public class Recursion3 {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {

    }
}
