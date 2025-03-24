package variableanddatatype;

import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        System.out.println("Read character in java ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = input.next().charAt(0);
        System.out.println("You Enter a charater : " + ch);

        input.close();
    }
}
