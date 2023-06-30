package org.kozak127.templates.restmongospring.apple;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppleRepository extends MongoRepository<Apple, String>  {
}
