package basic;

public class Test {

    String name;
    int age;

    private Test(){
        System.out.println("This is private contructor");
    }

    public Test(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Test ts = new Test();
        System.out.println(ts);

        Test ts1 = new Test("Ram Kumar", 20);
        System.out.println(ts1.name);
        System.out.println(ts1.age);
    }
}
