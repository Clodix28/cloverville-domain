import java.util.UUID;

public class CommunityTotal {

    private UUID id;
    private int totalGreenActions;
    private int totalCommunalTasks;
    private int totalResidents;

    public CommunityTotal(UUID id, int totalGreenActions, int totalCommunalTasks, int totalResidents) {
        this.id = id;
        this.totalGreenActions = totalGreenActions;
        this.totalCommunalTasks = totalCommunalTasks;
        this.totalResidents = totalResidents;
    }

    public UUID getId() {
        return id;
    }

    public int getTotalGreenActions() {
        return totalGreenActions;
    }

    public int getTotalCommunalTasks() {
        return totalCommunalTasks;
    }

    public int getTotalResidents() {
        return totalResidents;
    }

    public void incrementGreenActions() {
        totalGreenActions++;
    }

    public void incrementCommunalTasks() {
        totalCommunalTasks++;
    }

    public void incrementResidents() {
        totalResidents++;
    }

    @Override
    public String toString() {
        return "CommunityTotal{" +
                "id=" + id +
                ", totalGreenActions=" + totalGreenActions +
                ", totalCommunalTasks=" + totalCommunalTasks +
                ", totalResidents=" + totalResidents +
                '}';
    }
}