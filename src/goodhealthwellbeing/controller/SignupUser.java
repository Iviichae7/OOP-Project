package goodhealthwellbeing.controller;

import goodhealthwellbeing.model.User;
import goodhealthwellbeing.model.UserManager;

/**
 * Handles the user signup process.
 * Validates the user input and registers new users.
 * @author Michael Babik
 */

public class SignupUser {
    
    private final UserManager userManager;
    
    public SignupUser(UserManager userManager){
        this.userManager = userManager;
    }
    
    public boolean signupNewUser(String fullName, String email, String password){

        // Check if any fields are empty.
        if(fullName.isEmpty() || email.isEmpty() || password.isEmpty()){
            return false;
        }

        // Check if the full name contains any digits.
        if(fullName.matches(".*\\d.*")){
            return false;
        }

        // Check if the email contains the required email characters.
        if(!email.contains("@") || !email.contains(".") || email.lastIndexOf('.') >= email.length() - 1){
            return false;
        }

        // Check if the password is at least 6 characters long.
        if(password.length() < 6){
            return false;
        }

        // Check if a user with the email already exists.
        if(userManager.getUserByEmail(email) != null){
            return false;
        }
        
        User addNewUser = new User(fullName, email, password);
        userManager.addUser(addNewUser);

        // If all pass then the user is added.
        return true;
    }
}
