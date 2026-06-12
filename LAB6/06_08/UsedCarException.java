public class UsedCarException extends Exception{

    public UsedCarException(String vin) {
        super("Error - wrong data - VIN: " + vin);
    }
}
