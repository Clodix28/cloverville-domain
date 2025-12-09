import java.util.ArrayList;
import java.util.List;

public class Resident {

    // 6-digit ID like 123456
    private int residentId;

    // Associations
    private PointsAccount pointsAccount;          // 1..1
    private List<Action> actions = new ArrayList<>(); // 0..*

    public Resident(int residentId) {
        this.residentId = residentId;
    }

    public int getResidentId() {
        return residentId;
    }

    public PointsAccount getPointsAccount() {
        return pointsAccount;
    }

    public void setPointsAccount(PointsAccount pointsAccount) {
        this.pointsAccount = pointsAccount;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void addAction(Action action) {
        actions.add(action);
        if (pointsAccount != null) {
            pointsAccount.addPoints(action.getPointsAwarded());
        }
    }
}