package math.app.version1.service.Impl;

import math.app.version1.model.Department;
import math.app.version1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentDataHelper {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentDataHelper(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public Map<String, List<Department>> getDepartmentsByLevel() {
        List<Department> departments = departmentService.listAllDepartment();
        Map<String, List<Department>> departmentsByLevel = new HashMap<>();

        for (Department department : departments) {
            String level = department.getLevel();
            departmentsByLevel
                    .computeIfAbsent(level, k -> new ArrayList<>())
                    .add(department);
        }

        return departmentsByLevel;
    }
}
