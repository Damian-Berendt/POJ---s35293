import java.io.IOException;
import java.util.Date;

public class DogsAlarm implements Alarm {
    private Logger logger;

    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Psy zostały wypuszczone z klatek, powodzenia :)";


        Date date = pinEvent.eventDate;
        String logMessage = message + " [DATA] - " + date;

        logger.LogMessage(Severity.WARNING, EventSource.ALARM, logMessage);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Miły pan odprowadził psy z powrotem do klatki";

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
