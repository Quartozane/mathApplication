package math.app.version1.service.Impl;

import lombok.RequiredArgsConstructor;
import math.app.version1.repository.LevelRepository;
import math.app.version1.service.LevelService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LevelServiceImpl implements LevelService {
    private final LevelRepository levelRepository;

}
