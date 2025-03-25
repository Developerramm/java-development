package loops;

import java.util.Scanner;

public class PrintMultipleOf5And7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        while (true) {
            if (number == 35) {
                System.out.println("You got the number");
                System.out.println(number);
                break;
            } else if (number > 35) {
                System.out.println("Enter small number : ");
                number = input.nextInt();
            } else if (number < 35) {
                System.out.println("Enter greater number : ");
                number = input.nextInt();
            }
        }

        input.close();
    }

}
