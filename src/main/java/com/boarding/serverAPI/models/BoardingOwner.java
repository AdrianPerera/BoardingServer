package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class BoardingOwner {
    @Id
    private ObjectId owner_id;
    private ObjectId boarding_id;
    private String first_name;
    private String last_name;
    private String DOB;
    private String contact_no;
    private String address;
    private String image_url;


    public BoardingOwner() {

    }

    public BoardingOwner(ObjectId _id, ObjectId boarding_id, String first_name, String last_name, String DOB, String contact_no, String address, String image_url) {
        this.owner_id = _id;
        this.boarding_id = boarding_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.contact_no = contact_no;
        this.address = address;
        this.image_url = image_url;
    }

    public String getOwner_id() {
        return owner_id.toHexString();
    }

    public void setOwner_id(ObjectId owner_id) {
        this.owner_id = owner_id;
    }

    public String  getBoarding_id() {
        return boarding_id.toHexString();
    }

    public void setBoarding_id(ObjectId boarding_id) {
        this.boarding_id = boarding_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
