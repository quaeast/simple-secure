package cn.quaeast.securedemo.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SayHello {
    @GetMapping
    public String say(){
        return "hello";
    }
}
