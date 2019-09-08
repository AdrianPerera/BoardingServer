package com.boarding.serverAPI.repositories;

import com.boarding.serverAPI.models.BoardingData;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardingDataRepository extends MongoRepository<BoardingData,String>{
        BoardingData findBy_id(ObjectId _id)  ;
}
