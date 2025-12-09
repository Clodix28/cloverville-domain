import java.util.UUID;

public class AdminUser {

    private UUID adminId;
    private String name;
    private String role;

    public AdminUser(UUID adminId, String name, String role) {
        this.adminId = adminId;
        this.name = name;
        this.role = role;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }
}