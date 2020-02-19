package cn.quaeast.securedemo.security;

import cn.quaeast.securedemo.RegistrationForm;
import cn.quaeast.securedemo.data.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.Registration;

@Controller
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

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        System.out.println("-----------------ok");
        System.out.println(form.getUsername());
        System.out.println(form.getPassword());
        userRepository.save(form.toUser(passwordEncoder));
        System.out.println("-----------------ok");
        return "redirect:/login";
    }
}
