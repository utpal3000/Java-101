import java.util.Scanner;

public class Greetings {
   public static void main(String[] args) {
    //assign2.2 greet a user!
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name :");
    String name = input.nextLine();
    System.out.println("Good Morning " + name+"!");
    System.out.println("Cause there's a saying in hindi, Jab jago tab savera :D");
   } 
}
