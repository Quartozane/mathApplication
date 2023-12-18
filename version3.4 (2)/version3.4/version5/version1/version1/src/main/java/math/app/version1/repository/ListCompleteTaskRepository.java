package math.app.version1.repository;

import math.app.version1.model.ListCompleteTask;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListCompleteTaskRepository extends MongoRepository<ListCompleteTask, ObjectId> {
    ListCompleteTask findByUserId(ObjectId id);
}
