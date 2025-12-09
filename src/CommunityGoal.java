public class CommunityGoal {

    private String name;
    private String description;
    private int requiredPoints;
    private boolean unlocked;

    public CommunityGoal(String name, String description, int requiredPoints) {
        this.name = name;
        this.description = description;
        this.requiredPoints = requiredPoints;
        this.unlocked = false;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getRequiredPoints()
    {
        return requiredPoints;
    }

    public boolean isUnlocked()
    {
        return unlocked;
    }

    public void updateUnlockStatus(CommunityTotal totals)
    {
        if (!unlocked && totals.getCommunityGreenPoints() >= requiredPoints) {
            unlocked = true;
        }
    }
}