public class UserWithPassword {

    private User user;

    private String password;

    UserWithPassword(User user){
        this.user = user;
    }


    String getName() {
        return user.getName();
    }

    String getUserName() {
        return user.getUserName();
    }

    Boolean getAdmin() {
        return user.getAdmin();
    }

    String getLastName() {
        return user.getLastName();
    }

    Integer getId() {
        return user.getId();
    }

    String getPassword()
    {
        return this.password;
    }
}
