package basic;

class Student {
    String name = "Ram Kumar";
    int age = 30;
    int rollNo = 1;

    public Student(){
        System.out.println("Student constructor here");
    }
}

public class Person {
    public int age = 20;

    public static void main(String[] args) {
        Person ram = new Person();
        System.out.println(ram.age);

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
    }

}
