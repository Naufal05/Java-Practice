import java.util.Scanner;

// to read input from the user

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You have entered string" + s);
        int a = in.nextInt();
        System.out.println("Entered number is" + a);
        float b = in.nextFloat();
        System.out.println("Entered float number is" + b);
    }
}
