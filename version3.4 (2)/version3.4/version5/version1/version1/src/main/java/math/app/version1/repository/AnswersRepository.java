package math.app.version1.repository;

import math.app.version1.model.Answers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AnswersRepository extends MongoRepository<Answers, ObjectId> {
    Optional<Answers> findById(ObjectId id);
    Answers findByStuff(String stuff);
}
