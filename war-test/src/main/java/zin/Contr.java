package zin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vitaliy on 9/7/2015.
 */
@Controller
public class Contr {
    public Contr() {
        System.out.println("zin.Contr");
    }

    @ResponseBody
    @RequestMapping("/test")
    public void test() {
        System.out.println("Contr test");
    }
}
