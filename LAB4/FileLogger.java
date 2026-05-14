import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private Severity logLevel;

    public FileLogger(Severity logLevel) {
        this.logLevel = logLevel;
    }


    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message) {
        if (severity == Severity.ERROR || severity == Severity.WARNING) {
            String logMessage = "[SZKODLIWOŚĆ] - " + severity + " [ŹRÓDŁO] - " + eventSource + " [WIADOMOŚĆ] - " + message;
            try {
                FileWriter writer = new FileWriter("SafeLogs.txt", true);
                writer.write(logMessage + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Błąd podczas próby zapisu do pliku ");
            }
        }
    }

}
