// How to Read and Print an Integer value in Java

import java.util.Scanner;

/**
 * one
 */
class one {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter the integer:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("Entered number is :" + num);
    }
}