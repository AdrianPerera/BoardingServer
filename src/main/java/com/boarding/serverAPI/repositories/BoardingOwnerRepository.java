package com.boarding.serverAPI.repositories;

import com.boarding.serverAPI.models.Boardingowner;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardingOwnerRepository extends MongoRepository<Boardingowner,String> {
    Boardingowner findBy_id(ObjectId _id);

}

