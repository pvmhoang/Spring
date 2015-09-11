package hoang.pham.vn;

import org.springframework.cache.annotation.Cacheable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hoangpvm on 9/9/2015.
 */
public class UserService {

    private Map<Integer, User> userMap = new HashMap<Integer, User>();

    {
        userMap.put(1, new User(1,"Hoang Pham",31));
        userMap.put(2, new User(2,"Mai Lam",25));
    }

    @Cacheable (value = "user")
    public User getUser(int id){
        System.out.println("User with id " + id + " requested.");
        User user = userMap.get(id);
        return user;
    }


}
