package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Boardingdata {

    public Boardingdata(){

    }

    @Id
    private ObjectId _id;
    private ObjectId owner_id;
    private String address;
    private String name;
    private String image_url;
    private List<Room> roomList;

    public Boardingdata(ObjectId _id, ObjectId owner_id, String address, String name, String image_url, List<Room> roomList) {
        this._id = _id;
        this.owner_id = owner_id;
        this.address = address;
        this.name = name;
        this.image_url = image_url;
        this.roomList = roomList;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(ObjectId owner_id) {
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

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}


