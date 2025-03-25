package conditional;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        System.out.println("if condition in java");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = input.nextInt();
        if(number >= 100){
            System.out.println("number is greater than or equal to 100");
        }else{
            System.out.println("number is less than 100");
        }

        input.close();
    }
}
