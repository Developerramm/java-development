package basic;

public class Bicycle {

    private int gear = 5;

    public void breaking(){
        System.out.println("Breaking the bicycle ");
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.gear);
        bicycle.breaking();
    }
}
