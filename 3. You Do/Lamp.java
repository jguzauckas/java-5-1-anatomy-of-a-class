public class Lamp {
    private boolean isOn;
    private String lightbulbType;
    private int wattage;

    public Lamp() {
        isOn = false;
        lightbulbType = "";
        wattage = -1;
    }

    public Lamp(boolean i, String l, int w) {
        // Code to set up Lamp.
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String getLightbulbType() {
        // Code to return type of lightbulb.
    }

    public int getWattage() {
        // Code to return wattage.
    }

    // Turns on lamp and notifies user.
    public void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    // Turns off lamp and notifies user.
    public void turnOff() {
        
    }

    // This method will take a new lightbulbType l and a new wattage w to
    // replace the old lightbulb, and print out information about the new one.
    public void changeBulb(String l, int w) {
        // Code to change lightbulb type and wattage based on input.
        // Prints out new type and wattage.
    }
}