package com.lukaroncevic.reactivemongo.repositories;

import com.lukaroncevic.reactivemongo.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
