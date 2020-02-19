package cn.quaeast.securedemo.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SayHelloController {
    @GetMapping
    public String say(){
        return "hello";
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void echo(@RequestBody String s){
        System.out.println(s);
    }
}
