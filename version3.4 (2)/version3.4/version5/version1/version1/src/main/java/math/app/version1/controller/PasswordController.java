package math.app.version1.controller;

import lombok.RequiredArgsConstructor;
import math.app.version1.security.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
@RequiredArgsConstructor
public class PasswordController {

    private final PasswordEncoder passwordEncoder;

    @GetMapping("/encode")
    public String encodePasswords() {
        return "encodePasswords";
    }

    @PostMapping("/encode-passwords")
    public String encodeAll() {
        passwordEncoder.encodeAll();
        return "encodedComplete";
    }
}
