import java.io.IOException;
import java.util.ArrayList;

public class Safe {
    public ArrayList<Alarm> alarms = new ArrayList<>();
    private String pin;

    public Safe(String pin) {
        if (pin == null || pin.isEmpty()) {
            throw new IllegalArgumentException("ERROR: PIN jest pusty");
        }
        this.pin = pin;
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String pin) throws IOException {
        if (this.pin.equals(pin)) {
            correctPin();
        } else {
            wrongPin();
        }
    }

    private boolean isAlarmActive;

    private void wrongPin() throws IOException {
        isAlarmActive = true;
        PinEvent pinEvent = new PinEvent(this);
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(pinEvent);
        }
    }

    private void correctPin() throws IOException {
        if (isAlarmActive) {
            PinEvent pinEvent = new PinEvent(this);
            for (Alarm alarm : alarms) {
                alarm.alarmTurnOff(pinEvent);
            }
            isAlarmActive = false;
        } else {
            System.out.println("Sejf został pomyślnie otwarty bez problemów");
        }
    }
}
