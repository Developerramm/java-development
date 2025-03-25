package basic;

public class MethodOverloading {

    private static void display(int number) {
        System.out.println("Integer print " + number);
    }

    public static void display(String name) {
        System.out.println("Print string " + name);
    }

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        display(10);
        display("Ram Kumar");

        MethodOverloading hs = new MethodOverloading();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }

}
