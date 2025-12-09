import java.util.UUID;

public class TradeItem {

    private UUID itemId;
    private String name;
    private String description;
    private String category;

    public TradeItem(UUID itemId, String name, String description, String category) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}