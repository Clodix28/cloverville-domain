import java.util.UUID;

public class InspirationCatalogueItem {

    private UUID itemId;
    private String title;
    private String description;
    private String category;

    public InspirationCatalogueItem(UUID itemId, String title, String description, String category) {
        this.itemId = itemId;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "InspirationCatalogueItem{" +
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}