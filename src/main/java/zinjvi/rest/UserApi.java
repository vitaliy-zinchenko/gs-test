package zinjvi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zinjvi.model.User;
import zinjvi.service.UserService;

/**
 * Created by Vitaliy on 9/5/2015.
 */
@Controller
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{name}", method = RequestMethod.PUT)
    @ResponseBody
    public void getUser(String name) {
        User user = new User();
        user.setName(name);
        userService.write(user);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
