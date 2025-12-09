import java.util.UUID;

public class WeeklyFocusTask {

    private UUID taskId;
    private String title;
    private String description;
    private int weekNumber;

    public WeeklyFocusTask(UUID taskId, String title, String description, int weekNumber) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.weekNumber = weekNumber;
    }

    public UUID getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    @Override
    public String toString() {
        return "WeeklyFocusTask{" +
                "taskId=" + taskId +
                ", title='" + title + '\'' +
                ", weekNumber=" + weekNumber +
                '}';
    }
}