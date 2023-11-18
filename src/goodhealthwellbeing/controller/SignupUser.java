package goodhealthwellbeing.controller;

import goodhealthwellbeing.model.User;
import goodhealthwellbeing.model.UserManager;

/**
 * @author Michael Babik
 */
public class SignupUser {
    
    private final UserManager userManager;
    
    public SignupUser(UserManager userManager){
        this.userManager = userManager;
    }
    
    public boolean signupNewUser(String fullName, String email, String password){
        
        if(fullName.isEmpty() || email.isEmpty() || password.isEmpty()){
            return false;
        }
        
        if(userManager.getUserByEmail(email) != null){
            return false;
        }
        
        User addNewUser = new User(fullName, email, password);
        userManager.addUser(addNewUser);
        
        return true;
    }
}
