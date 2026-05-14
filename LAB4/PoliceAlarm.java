import java.io.IOException;
import java.util.Date;

public class PoliceAlarm implements Alarm {
    private Logger logger;

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Powiadomiono policje o próbie włamania";

        Date date = pinEvent.eventDate;
        String logMessage = message + " [DATA] - " + date;

        logger.LogMessage(Severity.ERROR, EventSource.ALARM, logMessage);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Policja została poinformowana, że sprawa została rozwiązana";

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
