package OOP;

public class Animal {

    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("I can eat ");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }
}
