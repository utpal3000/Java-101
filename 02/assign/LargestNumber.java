import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // 5. Take 2 numbers as input and print the largest number.
        System.out.println("Enter first number:");
        Scanner input = new Scanner(System.in);
        double fNumber = input.nextInt();
        System.out.println("Enter second number:");
        double sNumber = input.nextInt();
        if (fNumber<sNumber){
            System.out.println("The largest number is :" + sNumber);
        }else{
            System.out.println("The largest number is :" + fNumber);
        }

    }
    
}
