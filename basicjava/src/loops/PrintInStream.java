package loops;

import java.util.Scanner;

public class PrintInStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum = 0;

        while (num != -1) {
            sum += num;
            num = input.nextInt();
        }
        System.out.println(sum);
        input.close();
    }

}
