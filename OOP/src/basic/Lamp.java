package basic;

public class Lamp {

    boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("The lamp is " + isOn);
    }

    public void turnOff(){
        isOn = false;
        System.out.println("The lamp is " + isOn);
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogenLamp = new Lamp();
        led.turnOn();
        led.turnOff();

        halogenLamp.turnOn();
        halogenLamp.turnOff();
    }

}
