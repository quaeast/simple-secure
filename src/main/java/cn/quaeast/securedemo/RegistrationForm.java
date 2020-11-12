package cn.quaeast.securedemo;

import cn.quaeast.securedemo.eneity.WebUser;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {
    private String username;
    private String password;

    public WebUser toUser(PasswordEncoder passwordEncoder) {
        return new WebUser(
                username,
                passwordEncoder.encode(password));
    }
}

