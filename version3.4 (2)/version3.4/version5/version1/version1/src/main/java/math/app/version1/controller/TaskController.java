package math.app.version1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import math.app.version1.model.Department;
import math.app.version1.repository.TasksRepository;
import math.app.version1.service.Impl.DepartmentDataHelper;
import math.app.version1.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/public")
@Slf4j
public class TaskController {

    private final TaskService taskService;
    private final DepartmentDataHelper departmentDataHelper;
    private final TasksRepository tasksRepository;

    @GetMapping("/no-task-in-database")
    public String noTaskInDatabase(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "noTaskInDatabase";
    }


}
