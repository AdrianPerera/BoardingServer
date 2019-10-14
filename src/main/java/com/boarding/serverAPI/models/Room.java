package com.boarding.serverAPI.models;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

public class Room {
    private String image_url;
    private boolean room_availability;
    private boolean washroom_availabilty;
    private Integer NoOfBeds;
    private Integer size;
    private Double price;

    public Room(){

    }

    public Room(String image_url, boolean room_availability, boolean washroom_availabilty, Integer noOfBeds, Double price, Integer size) {
        this.image_url = image_url;
        this.room_availability = room_availability;
        this.washroom_availabilty = washroom_availabilty;
        NoOfBeds = noOfBeds;
        this.price = price;
        this.size = size;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isRoom_availability() {
        return room_availability;
    }

    public void setRoom_availability(boolean room_availability) {
        this.room_availability = room_availability;
    }

    public boolean isWashroom_availabilty() {
        return washroom_availabilty;
    }

    public void setWashroom_availabilty(boolean washroom_availabilty) {
        this.washroom_availabilty = washroom_availabilty;
    }

    public Integer getNoOfBeds() {
        return NoOfBeds;
    }

    public void setNoOfBeds(Integer noOfBeds) {
        NoOfBeds = noOfBeds;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
