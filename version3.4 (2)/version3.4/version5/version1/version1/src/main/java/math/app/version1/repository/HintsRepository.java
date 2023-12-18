package math.app.version1.repository;

import math.app.version1.model.Hints;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface HintsRepository extends MongoRepository<Hints, ObjectId> {

    Optional<Hints> findById(ObjectId id);
    Hints findByStuff(String stuff);
}
