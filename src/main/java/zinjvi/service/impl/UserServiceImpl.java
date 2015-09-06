package zinjvi.service.impl;

import org.openspaces.core.GigaSpace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zinjvi.model.User;
import zinjvi.service.UserService;

import javax.annotation.PostConstruct;

/**
 * Created by Vitaliy on 9/5/2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private GigaSpace gigaSpace;

//    @PostConstruct
//    public void init() {
//        User user = new User();
//        user.setName("bob");
//        write(user);
//    }

    public void write(User user) {
        gigaSpace.write(user);
    }

    public GigaSpace getGigaSpace() {
        return gigaSpace;
    }

    public void setGigaSpace(GigaSpace gigaSpace) {
        this.gigaSpace = gigaSpace;
    }
}
