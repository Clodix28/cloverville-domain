import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Action {

    private UUID actionId;
    private String description;
    private LocalDateTime dateRegistered;
    private int pointsAwarded;

    // link back to Resident
    private Resident resident;

    protected Action(UUID actionId, String description, int pointsAwarded, Resident resident) {
        this.actionId = actionId;
        this.description = description;
        this.pointsAwarded = pointsAwarded;
        this.dateRegistered = LocalDateTime.now();
        this.resident = resident;
    }

    public UUID getActionId() {
        return actionId;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public int getPointsAwarded() {
        return pointsAwarded;
    }

    public Resident getResident() {
        return resident;
    }
}