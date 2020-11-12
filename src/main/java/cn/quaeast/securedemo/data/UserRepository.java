package cn.quaeast.securedemo.data;

import cn.quaeast.securedemo.eneity.WebUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<WebUser, Long> {
    WebUser findByUsername(String username);
}
