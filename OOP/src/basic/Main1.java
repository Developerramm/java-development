package basic;

class Test1{
    static int max = 10;
    int min = 20;
}

public class Main1 {

    public static void main(String[] args) {
        System.out.println("hello ram kumar");
        System.out.println(Test1.max);
        // System.out.println(Test1.min);

        Test1 t1 = new Test1();
        System.out.println(t1.min);
    }
}
