package conditional;

import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("Number is disible by 3 or 5 ");
        } else {
            System.out.println("Number is not disible by 3 or 5");
        }
        input.close();
    }

}
