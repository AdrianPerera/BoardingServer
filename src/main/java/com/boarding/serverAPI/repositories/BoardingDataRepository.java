package com.boarding.serverAPI.repositories;

import com.boarding.serverAPI.models.Boardingdata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardingDataRepository extends MongoRepository<Boardingdata, String> {
    Boardingdata findBy_id(ObjectId _id);
}
