package math.app.version1.repository;

import math.app.version1.model.Level;
import math.app.version1.model.Tasks;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TasksRepository extends MongoRepository<Tasks, ObjectId> {

    boolean existsById(ObjectId id);
    List<Tasks> findAllByLevel(String level);
    List<Tasks> findAllByDepartmentNameAndLevel(String departmentName,String level);
    List<Tasks> findAllByDepartmentName(String departmentName);
}