import java.io.IOException;
import java.util.Date;

public class SoundAlarm implements Alarm {
    private Logger logger;

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Na posesji został uruchomiony alarm dzwiękowy";

        Date date = pinEvent.eventDate;
        String logMessage = message + " [DATA] - " + date;

        logger.LogMessage(Severity.WARNING, EventSource.ALARM, logMessage);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Alarm dzwiękowy został wyłączony";

        Date date = pinEvent.eventDate;
        String logMessage = message + " [DATA] - " + date;
        logger.LogMessage(Severity.INFORMATION, EventSource.ALARM, logMessage);
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }
}
