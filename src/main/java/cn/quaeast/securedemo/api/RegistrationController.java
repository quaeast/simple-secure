package cn.quaeast.securedemo.api;

import cn.quaeast.securedemo.RegistrationForm;
import cn.quaeast.securedemo.data.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/register")
@Data
@AllArgsConstructor
public class RegistrationController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public String processRegistration(@RequestBody RegistrationForm form) {
        System.out.println("-----------------ok");
        System.out.println(form.getUsername());
        System.out.println(form.getPassword());
        userRepository.save(form.toUser(passwordEncoder));
        return "Registration Succeed";
    }
}
