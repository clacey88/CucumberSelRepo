package Models;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public User user;

    public List<User> users = new ArrayList<>();


    public void addUser(User user){
        users.add(user);
    }
}
