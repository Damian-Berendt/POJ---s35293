
import java.util.Date;

public class PinEvent {
    private Safe safe;
    public Date eventDate;

    public PinEvent(Safe safe) {
        this.safe = safe;
        eventDate = new Date();
    }

    public Safe getSafe() {
        return safe;
    }

}
