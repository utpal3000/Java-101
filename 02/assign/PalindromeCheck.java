import java.util.Scanner;

public class PalindromeCheck {ba
    public static void main(String[] args) {
        //Check a given string is if palindrome
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String gString = input.nextLine();
        // String newString = gString.toLowerCase();
        // String newString2 == newString[::-1];
        String reversedString = new StringBuilder(gString).reverse().toString();
        if (gString.equals(reversedString)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("NOT Palindrome!");
        }
        System.out.println(gString);
    }
}
