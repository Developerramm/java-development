package variableanddatatype;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number1 ");
        int number1 = input.nextInt();
        System.out.println("Enter number2 ");
        int number2 = input.nextInt();
        double sum = number1 + number2;

        System.out.println("The sum is " + sum);

        input.close();
    }

}
