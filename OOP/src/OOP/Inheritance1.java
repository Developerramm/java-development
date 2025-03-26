package OOP;

class Animal{
    public void eat(){
        System.out.println("The Animal is eating here ");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("The dog is eating here ");
    }

    public void bark(){
        System.out.println("The dog is barking here ");
    }
}

public class Inheritance1 {

    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.bark();
        labrador.eat();

        Animal a = new Animal();
        a.eat();
    }

}
