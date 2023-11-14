package goodhealthwellbeing;

import java.util.ArrayList;

/**
 * @author Michael Babik
 */

public class UserManager {

    private static UserManager userInstance;
    private final ArrayList<User> users = new ArrayList<>();

    // Private constructor
    private UserManager() {
    }

    /**
     * A method to get the instance of the UserManager class.
     * 
     * @return
     */
    public static UserManager getUser() {
        if (userInstance == null) {
            userInstance = new UserManager();
        }
        return userInstance;
    }

    /**
     * A new user added to the collection of users if the user does not already
     * exist.
     * If a user with the same email address already exists in the collection
     * the new user is not added to prevent duplicates.
     * 
     * @param user
     */
    public void addUser(User user) {
        if (getUserByEmail(user.getEmail()) != null) {
            return;
        }
        users.add(user);
    }

    /**
     * Retrieves a user from the collection based on their email address.
     * Loops through the collection of users and returns the user whose email
     * matches the provided email address. If no matching user is found, returns
     * null.
     * 
     * @param email
     * @return
     */
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Validates a user credentials by checking the email and password.
     * First it retrieve a user with the given email. If the user is found
     * it then checks if the provided password matches the user's password. If both
     * the email and password are correct it returns true, otherwise false.
     * 
     * @param email
     * @param password
     * @return
     */
    public boolean validateUser(String email, String password) {
        User user = getUserByEmail(email);
        if (user != null) {
            return user.checkPassword(password);
        }
        return false;
    }

}
