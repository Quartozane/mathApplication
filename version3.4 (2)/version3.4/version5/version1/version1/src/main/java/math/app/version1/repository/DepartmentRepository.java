package math.app.version1.repository;

import math.app.version1.model.Department;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, ObjectId> {

    boolean existsByNameOfDepartment(String nameOfDepartment);
    Optional<Department> findByNameOfDepartment(String nameOfDepartment);
}
