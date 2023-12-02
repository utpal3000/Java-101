import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Principle Amount :");
        int pamount = input.nextInt();
        System.out.println("Please enter rate of interest :");
        float irate=input.nextFloat();
        System.out.println("Please enter time duration (in years) :");
        int tduration = input.nextInt();
        float sinterest = (pamount*irate*tduration)/100;
        System.out.println("Simple interest is :" + sinterest);
    }
}
