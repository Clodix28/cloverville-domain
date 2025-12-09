import java.util.UUID;

public class CommunalTask extends Action {

    public enum Status { PENDING, COMPLETED }

    private CommunalTaskType type;
    private Status status;

    public CommunalTask(UUID actionId,
                        CommunalTaskType type,
                        Resident resident) {
        super(actionId, type.getDescription(), type.getBasePoints(), resident);
        this.type = type;
        this.status = Status.PENDING;
    }

    public CommunalTaskType getType()
    {
        return type;
    }

    public Status getStatus()
    {
        return status;
    }

    public String getTaskName()
    {
        return type.getName();
    }

    public void complete()
    {
        this.status = Status.COMPLETED;
    }
}