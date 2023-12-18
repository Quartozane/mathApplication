package math.app.version1.repository;

import math.app.version1.model.Level;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends MongoRepository<Level, ObjectId> {
    boolean existsById(ObjectId id);

}
