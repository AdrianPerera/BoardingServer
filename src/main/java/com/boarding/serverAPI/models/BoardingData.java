package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class BoardingData  {

    public BoardingData(){

    }

    @Id
    private ObjectId boarding_id;
    private ObjectId owner_id;
    private String address;
    private String name;
    private String image_url;
    private List<Room> rooms;

    public BoardingData(ObjectId _id, ObjectId boardingOwner_id, String address, String name, String image_url, List<Room> rooms) {
        this.boarding_id = _id;
        this.owner_id = boardingOwner_id;
        this.address = address;
        this.name = name;
        this.image_url = image_url;
        this.rooms = rooms;
    }

    public String getBoarding_id() {
        return boarding_id.toHexString();
    }

    public void setBoarding_id(ObjectId boarding_id) {
        this.boarding_id = boarding_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public ObjectId getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(ObjectId owner_id) {
        this.owner_id = owner_id;
    }
}


