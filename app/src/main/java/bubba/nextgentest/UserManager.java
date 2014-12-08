package bubba.nextgentest;

public class UserManager {

    // Private static values
    private static UserPreview[] _userPreviews;


    // Saves a newly created user
    public static boolean SaveNewUser(String name) {
        return false; // TODO
    }

    // Updates the save-file of an existing user
    public static boolean SaveUser(String name) {
        return false; // TODO
    }

    // Loading an existing user
    public static User LoadUser(String name) {
        return null; // TODO
    }


    // Get a collection of every users preview
    public static UserPreview[] GetUserPreviews() {
        return _userPreviews.clone(); // TODO
    }

    // Reloads the collection of userpreviews
    public static void RefreshUserPreviews() {
        // TODO
    }
}
