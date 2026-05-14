import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger screenLogger = new ConsoleLogger(Severity.INFORMATION);

        Logger fileLogger = new FileLogger(Severity.WARNING);

        Alarm police = new PoliceAlarm();
        police.setLogger(fileLogger);

        Alarm dogs = new DogsAlarm();
        dogs.setLogger(screenLogger);

        Alarm bars = new BarsAlarm();
        bars.setLogger(screenLogger);

        Alarm sound = new SoundAlarm();
        sound.setLogger(screenLogger);

        Safe safe1 = new Safe("777");
        safe1.addAlarm(police);
        safe1.addAlarm(dogs);
        safe1.addAlarm(bars);

        System.out.println("1. BŁĘDNY PIN: ");
        safe1.enterPin("888");

        System.out.println("\n2. PRAWIDŁOWY PIN: ");
        safe1.enterPin("777");

        safe1.removeAlarm(police);
        safe1.removeAlarm(dogs);
        safe1.removeAlarm(bars);
        safe1.addAlarm(sound);

        System.out.println("\n3. ZNOWU BŁĘDNY PIN: ");
        safe1.enterPin("10");

    }

}