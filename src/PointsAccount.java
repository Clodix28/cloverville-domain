import java.time.LocalDateTime;
import java.util.UUID;

public class PointsAccount {

    private UUID accountId;
    private int balance;
    private LocalDateTime lastUpdated;

    public PointsAccount(UUID accountId) {
        this.accountId = accountId;
        this.balance = 0;
        this.lastUpdated = LocalDateTime.now();
    }

    public UUID getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void addPoints(int points) {
        this.balance += points;
        this.lastUpdated = LocalDateTime.now();
    }

    public void subtractPoints(int points) {
        this.balance -= points;
        this.lastUpdated = LocalDateTime.now();
    }
}