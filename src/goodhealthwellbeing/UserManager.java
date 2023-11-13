package goodhealthwellbeing;

import java.util.ArrayList;

/**
 * @author Michael Babik
 */

public class UserManager {
    
    private final ArrayList<User> users = new ArrayList<>();
    
    public void addUser(User user) {
        if (getUserByEmail(user.getEmail()) != null) {
            return;
        }
        users.add(user);
    }
    
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
    
    public boolean validateUser(String email, String password) {
        User user = getUserByEmail(email);
        if (user != null) {
            return user.checkPassword(password);
        }
        return false;
    }
    
}
