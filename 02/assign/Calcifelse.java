import java.util.Scanner;

public class Calcifelse {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        float fnumber = input.nextFloat();
        System.out.println("Enter second number:");
        float snumber = input.nextFloat();
        // System.out.println("Choose operator (1,2,3,4)(+,-,*,/):");
        // int operator = input.nextInt();
        //Earlier used numbers coz didn't knew about chatAt :)
        
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        if (operator=='+'){
            System.out.println("Sum is : "+ fnumber+snumber);
        }
         if (operator=='-'){
            System.out.println("Difference is : "+ (fnumber-snumber));
        }
         if (operator=='*'){
            System.out.println("Product is : "+ fnumber*snumber);
        }
         if (operator=='/'){
            System.out.println("Division is : "+ fnumber/snumber);
        }

    }
}
