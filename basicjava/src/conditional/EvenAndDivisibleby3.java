package conditional;

import java.util.Scanner;

public class EvenAndDivisibleby3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int number = input.nextInt();

        if ((number % 2 == 0) && (number % 3 == 0)) {
            System.out.println("Number is even and disible by 3");
        }
        System.out.println("always executed wala code ");
        input.close();
    }

}
