
import java.util.ArrayList;
import java.util.List;

public class Resident {

    private int residentId;

    private PointsAccount pointsAccount;           // 0..1
    private List<Action> actions = new ArrayList<>(); // 0..*

    public Resident(int residentId) {
        this.residentId = residentId;
    }

    public int getResidentId()
    {
        return residentId;
    }

    public PointsAccount getPointsAccount()
    {
        return pointsAccount;
    }


    public void setPointsAccount(PointsAccount pointsAccount)
    {
        this.pointsAccount = pointsAccount;
    }

    public List<Action> getActions()
    {
        return actions;
    }

    public void addAction(Action action)
    {
        actions.add(action);
    }


    public void registerAction(Action action, CommunityTotal communityTotal) {
        actions.add(action);

        if (action instanceof CommunalTask) {

            if (pointsAccount != null)
            {
                pointsAccount.addPoints(action.getPointsAwarded());
            }
            if (communityTotal != null)
            {
                communityTotal.incrementCommunalTasks();
            }
        } else if (action instanceof GreenAction)
        {
            if (communityTotal != null) {
                communityTotal.addCommunityGreenPoints(action.getPointsAwarded());
                communityTotal.incrementGreenActions();
            }
        }
    }
}