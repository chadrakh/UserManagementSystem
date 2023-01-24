public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private static int instanceCount;

    public User(String _firstName, String _lastName, String _email, String _password) {
        instanceCount++;

        this.id = instanceCount;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.password = _password;
    }

    @Override
    public String toString(){
        return id + ", " + firstName + " " + lastName + ", " + email;
//                "User ID: " + id + "\n"
//                + "First Name: " + firstName + "\n"
//                + "Last Name: " + lastName + "\n"
//                + "Email: " + email;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public Boolean validateEmail(){
        return null;
    }

    public Boolean validatePassword(){
        return null;
    }

    public Boolean confirmPassword(){
        return null;
    }

    public void hashPassword(){
        String inputPassword = password;
        // Link to hashing strings
        // https://www.scaler.com/topics/java/what-is-hashing-in-java/
    }

    public void saveUserDetails(){}

    public String getUserDetails(int userId, String searchParam){
        return null;
    }
}
