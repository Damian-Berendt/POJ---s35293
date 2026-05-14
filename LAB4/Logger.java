import java.io.IOException;

public interface Logger {

    public void LogMessage(Severity severity, EventSource eventSource, String message) throws IOException;

}
