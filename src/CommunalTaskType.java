

public class CommunalTaskType {

    private String name;
    private String description;
    private int basePoints;
    private boolean recurring;

    public CommunalTaskType(String name, String description, int basePoints, boolean recurring) {
        this.name = name;
        this.description = description;
        this.basePoints = basePoints;
        this.recurring = recurring;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getBasePoints()
    {
        return basePoints;
    }

    public boolean isRecurring()
    {
        return recurring;
    }
}