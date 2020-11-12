package cn.quaeast.securedemo.security;

import cn.quaeast.securedemo.eneity.WebUser;
import cn.quaeast.securedemo.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public UserRepositoryUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        WebUser user = userRepository.findByUsername(username);
        if (user!=null){
            return user;
        }
        throw new UsernameNotFoundException( "User '" + username + "' not found");
    }
}
