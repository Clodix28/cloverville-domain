import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class CommunityReport {

    private UUID reportId;
    private String reportPeriod;
    private int totalPointsDistributed;
    private LocalDateTime generatedDate;
    private Resident mostActiveResident;

    private List<Action> actions;

    public CommunityReport(UUID reportId,
                           String reportPeriod,
                           List<Action> actions,
                           Resident mostActiveResident,
                           int totalPointsDistributed) {
        this.reportId = reportId;
        this.reportPeriod = reportPeriod;
        this.actions = actions;
        this.mostActiveResident = mostActiveResident;
        this.totalPointsDistributed = totalPointsDistributed;
        this.generatedDate = LocalDateTime.now();
    }

    public UUID getReportId() {
        return reportId;
    }

    public String getReportPeriod() {
        return reportPeriod;
    }

    public int getTotalPointsDistributed() {
        return totalPointsDistributed;
    }

    public LocalDateTime getGeneratedDate() {
        return generatedDate;
    }

    public Resident getMostActiveResident() {
        return mostActiveResident;
    }

    public List<Action> getActions() {
        return actions;
    }
}