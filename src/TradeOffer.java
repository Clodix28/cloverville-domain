import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TradeOffer {

    private UUID offerId;
    private String title;
    private String description;
    private int pointsCost;
    private int quantityAvailable;
    private LocalDate expiryDate;

    private List<TradeItem> items = new ArrayList<>();

    public TradeOffer(UUID offerId, String title, String description,
                      int pointsCost, int quantityAvailable, LocalDate expiryDate) {
        this.offerId = offerId;
        this.title = title;
        this.description = description;
        this.pointsCost = pointsCost;
        this.quantityAvailable = quantityAvailable;
        this.expiryDate = expiryDate;
    }

    public void addItem(TradeItem item) {
        items.add(item);
    }

    public boolean redeem(Resident resident) {
        if (quantityAvailable <= 0) return false;
        if (resident.getPointsAccount().getBalance() < pointsCost) return false;

        resident.getPointsAccount().subtractPoints(pointsCost);
        quantityAvailable--;
        return true;
    }

    // getters omitted for brevity
}