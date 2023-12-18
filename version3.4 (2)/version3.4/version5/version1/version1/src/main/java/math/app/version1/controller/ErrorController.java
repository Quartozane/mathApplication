package math.app.version1.controller;

import lombok.RequiredArgsConstructor;
import math.app.version1.model.Department;
import math.app.version1.service.Impl.DepartmentDataHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/public")
@RequiredArgsConstructor
public class ErrorController {

    private final DepartmentDataHelper departmentDataHelper;
    @GetMapping("/error-resolving-template")
    public String departmentComplete(Model model) {
        Map<String, List<Department>> departmentsByLevel = departmentDataHelper.getDepartmentsByLevel();
        model.addAttribute("departmentsByLevel", departmentsByLevel);
        return "errorResolvingTemplate";
    }
}
