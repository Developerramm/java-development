package conditional;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Check number is odd or even ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("Number is odd ");
        }
        input.close();
    }

}
