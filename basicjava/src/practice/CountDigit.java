package practice;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nuber : ");
        int number = input.nextInt();

        int countdigit = 0;

        while (number != 0) {
            countdigit++;
            number = number / 10;
        }
        System.out.println("total digit " + countdigit);

        input.close();
    }

}
