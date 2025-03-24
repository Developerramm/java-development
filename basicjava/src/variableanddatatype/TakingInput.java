package variableanddatatype;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input in java class ");
        System.out.println("Ram kumar");
        System.out.println("Maniyari");
        System.out.println("Sitamarhi");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println("your age is " + age);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        input.close();
    }

}
