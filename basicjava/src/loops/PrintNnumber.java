package loops;

import java.util.Scanner;

public class PrintNnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int number = input.nextInt();

        int count = 1;
        while (count <= number) {
            System.out.print(count + " ");
            count++;
        }
        input.close();
    }

}
