class MobilePhone{
    private int phoneNumber;
    private String color;
    private String modelNumber;
    private String modelName;

    public MobilePhone() {
        phoneNumber = -1;
        color = "";
        modelNumber = "";
        modelName = "";
    }

    public MobilePhone(int p, String s, String mNum, String mName) {
        //code to set up phone
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getColor() {
        // Code to return color of phone.
    }

    public String getModelNumber() {
        // Code to return the model number of phone.
    }

    public String getModelName() {
        // Code to return the model name of phone.
    }

    // Prints a line stating that you are calling that number like "Now calling #########..."
    public void call(int outPhoneNumber){
        System.out.println("Now calling " + outPhoneNumber + "...");
    }

    // Prints a line stating that you are calling that number like "Texting ____ to #########..."
    public void message(String message, int outPhoneNumber){
        // Code to send the message.
    }

    // Prints a line stating that you are working on connecting like "Verifying user login..."
    public void connectInternet() {
        // Code to connect to the internet
    }

}