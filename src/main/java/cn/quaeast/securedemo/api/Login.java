package cn.quaeast.securedemo.api;

import cn.quaeast.securedemo.WebUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class Login {
    @GetMapping
    public String showInformation(){
        return "login";
    }
}
