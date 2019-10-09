package com.boarding.serverAPI.Beans;

import com.boarding.serverAPI.models.Boardingowner;

import java.util.ArrayList;

public class BoardingOwnerBean {
    private String  _id;
    private String first_name;
    private String last_name;
    private String DOB;
    private String contact_no;
    private String address;
    private String image_url;

    public BoardingOwnerBean(String first_name, String last_name, String DOB, String contact_no, String address, String image_url) {
        this._id = _id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.contact_no = contact_no;
        this.address = address;
        this.image_url = image_url;
    }



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
    public BoardingOwnerBean(){

    }
    public BoardingOwnerBean setToOwnerBean(Boardingowner boardingowner){
        BoardingOwnerBean boardingOwnerBean=new BoardingOwnerBean();
        boardingOwnerBean.set_id(boardingowner.get_id().toHexString());
        boardingOwnerBean.setAddress(boardingowner.getAddress());
        boardingOwnerBean.setFirst_name(boardingowner.getFirst_name());
        boardingOwnerBean.setLast_name(boardingowner.getLast_name());
        boardingOwnerBean.setDOB(boardingowner.getDOB());
        boardingOwnerBean.setContact_no(boardingowner.getContact_no());
        boardingOwnerBean.setImage_url(boardingowner.getImage_url());
        return boardingOwnerBean;
    }
}

