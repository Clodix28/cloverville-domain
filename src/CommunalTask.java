import java.util.UUID;

public class CommunalTask extends Action {

    public enum Status { PENDING, COMPLETED }

    private String taskName;
    private Status status;

    public CommunalTask(UUID actionId,
                        String taskName,
                        String description,
                        int pointsAwarded,
                        Resident resident) {
        super(actionId, description, pointsAwarded, resident);
        this.taskName = taskName;
        this.status = Status.PENDING;
    }

    public String getTaskName() {
        return taskName;
    }

    public Status getStatus() {
        return status;
    }

    public void complete() {
        this.status = Status.COMPLETED;
    }
}