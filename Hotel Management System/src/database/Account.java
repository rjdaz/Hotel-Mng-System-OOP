package database;

public class Account {
    private String id;
    private String username;
    private String password;
    private String fullName;

    public Account(String id, String username, String password, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    // Getters (optional, if you want to access fields safely)
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    // @Override
    // public String toString() {
    //     return "Account{id='" + id + "', username='" + username +
    //            "', password='" + password + "', fullName='" + fullName + "'}";
    // }
}
