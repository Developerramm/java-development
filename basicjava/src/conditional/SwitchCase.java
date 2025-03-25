package conditional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int dayNumber = input.nextInt();

        if (dayNumber > 7) {
            System.out.println("Please Enter a valid number : ");
            input.close();
            return;
        }

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thirdsday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("sunday funday");
        }
        input.close();
    }

}
