package math.app.version1.service.Impl;

import lombok.RequiredArgsConstructor;
import math.app.version1.model.Department;
import math.app.version1.repository.DepartmentRepository;
import math.app.version1.service.DepartmentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> listAllDepartment() {
        return departmentRepository.findAll();
    }
}