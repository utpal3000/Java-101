import java.util.Scanner;

public class InrtoUsd {
    public static void main(String[] args) {
        // Input currency in rupees and output in USD.
        System.out.println("Enter amount in INR (Rupees):");
        Scanner input = new Scanner(System.in);
        // 1000 INR / 83.33 = 13.52 USD
        // As of 4 Dec 4 am UTC 1 USD = 83.33 INR
        double rupees = input.nextDouble();
        System.out.println("The amount in USD (US Dollar) equals to :" + (float)(rupees/83.33));
    }
    
}
