import java.util.Scanner;
// import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        try (// To calculate Fibonacci Series up to n numbers.
        Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the nth term :");
            int nTerm = input.nextInt();
            // double phi = 1.61803398875;
            // double F_n = Math.pow(phi,nTerm) - Math.pow((1-phi),nTerm)/Math.sqrt(5);
            // System.out.println(F_n);

            long t1 = 0, t2 = 1;
            System.out.print("Fibonacci Series: " + t1 + ", " + t2);

            for (int i = 3; i <= nTerm; i++) {
                long sum = t1 + t2;
                System.out.print(", " + sum);
                t1 = t2;
                t2 = sum;
            }
        }

    }
}
