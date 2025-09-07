public class User {
    private int id;
    private String name;
    private String lastName;
    private boolean isAdmin;
    private String userName;

    private User(){}

    static User from(int id, String name, String lastName, Boolean isAdmin, String userName){
        User user = new User();
        user.id = id;
        user.name = name;
        user.lastName = lastName;
        user.isAdmin = isAdmin;
        user.userName = userName;
        return user;
    }

    String getName() {
        return name;
    }

    String getUserName() {
        return userName;
    }

    boolean getAdmin() {
        return isAdmin;
    }

    String getLastName() {
        return lastName;
    }

    int getId() {
        return id;
    }
}

