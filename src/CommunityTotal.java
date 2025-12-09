import java.util.UUID;

public class CommunityTotal {

    private UUID id;
    private int totalGreenActions;
    private int totalCommunalTasks;
    private int totalResidents;

    // NEW: shared community green points ("climate capital")
    private int communityGreenPoints;

    public CommunityTotal(UUID id, int totalGreenActions, int totalCommunalTasks, int totalResidents) {
        this.id = id;
        this.totalGreenActions = totalGreenActions;
        this.totalCommunalTasks = totalCommunalTasks;
        this.totalResidents = totalResidents;
        this.communityGreenPoints = 0;
    }

    public UUID getId()
    { return id;
    }

    public int getTotalGreenActions()
    {
        return totalGreenActions;
    }

    public int getTotalCommunalTasks()
    {
        return totalCommunalTasks;
    }

    public int getTotalResidents()
    {
        return totalResidents;
    }

    public int getCommunityGreenPoints()
    {
        return communityGreenPoints;
    }

    public void incrementGreenActions()
    {
        totalGreenActions++;
    }
    public void incrementCommunalTasks()
    {
        totalCommunalTasks++;
    }
    public void incrementResidents()
    {
        totalResidents++;
    }



    public void addCommunityGreenPoints(int points)
    {
        if (points > 0) {
            this.communityGreenPoints += points;
        }
    }


    public void resetCommunityGreenPoints()
    {
        this.communityGreenPoints = 0;
    }

    @Override
    public String toString()
    {
        return "CommunityTotal{" +
                "id=" + id +
                ", totalGreenActions=" + totalGreenActions +
                ", totalCommunalTasks=" + totalCommunalTasks +
                ", totalResidents=" + totalResidents +
                ", communityGreenPoints=" + communityGreenPoints +
                '}';
    }
}