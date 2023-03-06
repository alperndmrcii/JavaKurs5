package Gun31._02_Enum;

public class USER {

    String username;
    Soru.Role role;
    Soru.Status status;

    public USER(String username, Soru.Role role, Soru.Status status) {
        this.username = username;
        this.role = role;
        this.status = status;
    }

    @Override
    public String toString() {
        return "USER{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
