package web.backend.demo.application.facades;

import org.springframework.stereotype.Service;
import web.backend.demo.domains.user.User;
import web.backend.demo.domains.user.UserRepository;

@Service
public class UserFacade {

    private final UserRepository userRepository;

    public UserFacade(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String username, String password) {
        return userRepository.save(User.builder().name(username).password(password).build());
    }
}
