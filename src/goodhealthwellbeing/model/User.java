package goodhealthwellbeing.model;

/**
 * @author Michael Babik
*/

public class User {
    
    private String fullName;
    private String email;
    private String password;
    
    
    // Constructor
    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    // Setters & Getters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // A method to verify if the password equals to user input password
    public boolean checkPassword(String loginPasswordInput){
        return this.password.equals(loginPasswordInput);
    }
}
