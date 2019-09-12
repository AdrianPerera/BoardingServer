package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Boardingdata {

    public Boardingdata(){

    }

    @Id
    private ObjectId _id;
    private String owner_id;
    private String address;
    private String name;
    private String image_url;
    private List<Room> rooms;

    public Boardingdata(ObjectId boarding_id, String owner_id, String address, String name, String image_url, List<Room> rooms) {
        this._id = boarding_id;
        this.owner_id = owner_id;
        this.address = address;
        this.name = name;
        this.image_url = image_url;
        this.rooms = rooms;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
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
}


