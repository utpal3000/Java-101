import java.util.Scanner;

// package 02.assign;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // if (number >=2){

        //     if (number %2==0){
        //         System.out.println("This is even number");
        //     }
        //     else{
        //         System.out.println("This is an odd number!");
        //     }
        // }
        // else {
        //     System.out.println("Please enter a valid number!");
        // }
        String answer = "null";
        if (number % 2 ==0){
        answer = "Even";
        }else{
            answer = "Odd";
        }
        System.out.println("The number is "+answer);
    }
}
