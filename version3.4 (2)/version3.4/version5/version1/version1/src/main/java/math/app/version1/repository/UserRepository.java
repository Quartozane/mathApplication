package math.app.version1.repository;

import math.app.version1.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,ObjectId> {
   User findByMailAndPassword(String mail, String password);
    User findByMail(String mail);
}
