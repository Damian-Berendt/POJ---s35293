import java.io.IOException;

public interface Alarm {

    public void alarmTurnOn(PinEvent pinEvent) throws IOException;

    public void alarmTurnOff(PinEvent pinEvent) throws IOException;

    void setLogger(Logger logger);

    Logger getLogger();
}
