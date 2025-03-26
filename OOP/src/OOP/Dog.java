package OOP;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("this is dog default constructor ");
    }

    

    public void display(){
        System.out.println("Dog name is " + name);
    }
}
