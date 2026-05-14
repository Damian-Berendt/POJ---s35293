import java.io.IOException;
import java.util.Date;

public class BarsAlarm implements Alarm {
    private Logger logger;

    @Override
    public void alarmTurnOn(PinEvent pinEvent) throws IOException {
        String message = "Dom został całkowicie zamkniety przez kraty na oknach i drzwiach";


        Date date = pinEvent.eventDate;
        String logMessage = message + " [DATA] - " + date;

        logger.LogMessage(Severity.WARNING, EventSource.ALARM, logMessage);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) throws IOException {
        String message = "Kraty zostały podniesione, możliwość wejścia/wyjścia z domu przywrócona\"";
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
