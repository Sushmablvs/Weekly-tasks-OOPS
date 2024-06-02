public class Bulb {
    private boolean isOn;

    // Constructor
    public Bulb() {
        this.isOn = false; // Initially, bulb is off
    }

    // Method to turn on the bulb
    public void turnOn() {
        this.isOn = true;
        System.out.println("Bulb is now turned on.");
    }

    // Method to turn off the bulb
    public void turnOff() {
        this.isOn = false;
        System.out.println("Bulb is now turned off.");
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }

    public static void main(String[] args) {
        // Instantiate some Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turn on some bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Check if bulbs are on
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());

        // Turn off one of the bulbs
        bulb1.turnOff();

        // Check if bulbs are on after turning off one
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
    }
}
