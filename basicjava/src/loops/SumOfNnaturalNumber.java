package loops;

import java.util.Scanner;

public class SumOfNnaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get sum : ");
        int number = input.nextInt();

        int sum = 0;
        int count = 1;

        while(count <= number){
            sum += count;
            count++;
        }
        System.out.println("The sum is " + sum);
        input.close();
    }

}
