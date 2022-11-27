
// swaping numbers
import java.io.*;

public class four {
    // using XOR operator
    public static void usingXOR(int m, int n) {
        // logic of XOR operator
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("value of m is" + m + "and value of n is " + n);

    }

    // driver code
    public static void main(String[] args) {
        int m = 10, n = 5;
        usingXOR(m, n);
    }
}

/*
 * 2 Approaches:
 * 1. Creating an auxiliary memory cell in the memory.
 * 2. Without creating any auxiliary(additional) memory cell
 * 3. Using exclusive OR (Bitwise XOR) operat
 * 
 * using XOR is most preferable,- in bit level
 * This is the most optimal method as here directly computations are carried on
 * over bits instead of bytes as seen in above two methods.
 */

// class GFG {

// // Function to swap two numbers
// // Using temporary variable
// static void swapValuesUsingThirdVariable(int m, int n) {
// // Swapping the values
// int temp = m;
// m = n;
// n = temp;
// System.out.println("Value of m is " + m
// + " and Value of n is " + n);
// }

// // Main driver code
// public static void main(String[] args) {
// // Random integer values
// int m = 9, n = 5;

// // Calling above function to
// // reverse the numbers
// swapValuesUsingThirdVariable(m, n);
// }
// }