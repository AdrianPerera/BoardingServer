package com.boarding.serverAPI.repositories;

import com.boarding.serverAPI.models.Logindata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginDataRepository extends MongoRepository<Logindata,String> {
    Logindata findBy_id(ObjectId _id);

}
