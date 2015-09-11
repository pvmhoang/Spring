package hoang.pham.vn.config;

import hoang.pham.vn.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hoangpvm on 9/9/2015.
 */
@Component
public class UserService {

    private Map<Integer, hoang.pham.vn.User> userMap = new HashMap<Integer, hoang.pham.vn.User>();

    {
        userMap.put(1, new hoang.pham.vn.User(1,"Hoang Pham",31));
        userMap.put(2, new hoang.pham.vn.User(2,"Mai Lam",25));
        userMap.put(3, new hoang.pham.vn.User(3,"Ben",10));
    }

    @Cacheable (value = "user", condition = "#id > 1", unless = "#id > 2")
    public User getUser(int id){
        System.out.println("User with id " + id + " requested.");
        User user = userMap.get(id);
        return user;
    }

    @Cacheable (value = "user", condition = "#user.age > 25")
    public User getUser(User user){
        System.out.println("User with id " + user.getId() + " requested.");
        return userMap.get(user.getId());
    }

    @CacheEvict(value = "user" )
    public void removeUser(int id){
        userMap.remove(id);
    }

}
