
public class ConsoleLogger implements Logger {
    private Severity logLevel;

    public ConsoleLogger(Severity logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void LogMessage(Severity severity, EventSource eventSource, String message) {
        String logMessage = "[SZKODLIWOŚĆ] - " + severity + " [ŹRÓDŁO] - " + eventSource + " [WIADOMOŚĆ] - " + message;
        System.out.println(logMessage);
    }
}

