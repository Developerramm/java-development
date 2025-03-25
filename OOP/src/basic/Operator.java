package basic;

public class Operator {

    public int addNumber(int number1, int number2) {
        return number1 + number2;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = square(10);
        System.out.println(result);

        Operator obj = new Operator();
        result = obj.addNumber(10, 20);
        System.out.println(result);
    }

}
