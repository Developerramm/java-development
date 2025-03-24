package variableanddatatype;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Calculate simple interest ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle : ");
        double principle = input.nextDouble();
        System.out.println("Enter time : ");
        double time = input.nextDouble();
        System.out.println("Enter rate of interest : ");
        double rate = input.nextDouble();
        double si = (principle * time * rate) / 100;
        System.out.println("Simple interest is " + si);
        input.close();
    }
}
