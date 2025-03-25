package conditional;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        double age = input.nextDouble();
        if (age <= 12) {
            System.out.println("You are a child");
        } else if (age > 12 && age <= 18) {
            System.out.println("You are teenager");
        } else {
            System.out.println("You are adult");
        }

        input.close();
    }
}
