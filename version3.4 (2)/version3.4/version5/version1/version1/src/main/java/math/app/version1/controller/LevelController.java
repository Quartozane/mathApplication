package math.app.version1.controller;

import lombok.RequiredArgsConstructor;
import math.app.version1.model.Level;
import math.app.version1.repository.LevelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class LevelController {

    private final LevelRepository levelRepository;

    @GetMapping("/Level")
    private List<Level> getAllLevels(){
        return levelRepository.findAll();
    }
}
