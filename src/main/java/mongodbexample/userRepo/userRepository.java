package mongodbexample.userRepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import mongodbexample.model.message;

public interface userRepository extends MongoRepository<message, String>{

}
