package com.boarding.serverAPI.repositories;

import com.boarding.serverAPI.models.BoardingOwner;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardingOwnerRepository extends MongoRepository<BoardingOwner,String> {
    BoardingOwner findBy_id(ObjectId _id);

}
