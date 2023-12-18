package math.app.version1.security;

import lombok.RequiredArgsConstructor;
import math.app.version1.model.User;
import math.app.version1.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PasswordEncoder {

    private final UserRepository userRepository;

    public void encodePassword(User user) {
        String originalPassword = user.getPassword();
        String encodedPassword = Base64.getEncoder().encodeToString(originalPassword.getBytes());
        user.setPassword(encodedPassword);
    }

    public String decodePassword(String password) {
         return  new String(Base64.getDecoder().decode((password)));
    }
    public String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    public void encodeAll() {
        List<User> encodeAll = userRepository.findAll();
        for(User u: encodeAll) {
            encodePassword(u);
        }
        userRepository.saveAll(encodeAll);
    }

}
