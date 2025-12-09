import java.util.UUID;

public class GreenAction extends Action {

    private String category;
    private String proofAttachment; // optional

    public GreenAction(UUID actionId,
                       String description,
                       int pointsAwarded,
                       Resident resident,
                       String category,
                       String proofAttachment) {
        super(actionId, description, pointsAwarded, resident);
        this.category = category;
        this.proofAttachment = proofAttachment;
    }

    public String getCategory() {
        return category;
    }

    public String getProofAttachment() {
        return proofAttachment;
    }
}