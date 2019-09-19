package com.boarding.serverAPI.Beans;

import com.boarding.serverAPI.models.Boardingdata;
import com.boarding.serverAPI.models.Boardingowner;
import com.boarding.serverAPI.models.Room;
import java.util.List;

public class BoardingDataBean {

    public BoardingDataBean() {
    }

    private String _id;
    private String owner_id;
    private String address;
    private String name;
    private String image_url;
    private List<Room> roomList;

    public BoardingDataBean(String _id, String owner_id, String address, String name, String image_url, List<Room> roomList) {
        this._id = _id;
        this.owner_id = owner_id;
        this.address = address;
        this.name = name;
        this.image_url = image_url;
        this.roomList = roomList;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
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

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }


    public BoardingDataBean setToBean(Boardingdata boardingdata){
        BoardingDataBean boardingDataBean=new BoardingDataBean();
        
        boardingDataBean.set_id(boardingdata.get_id().toHexString());
        boardingDataBean.setOwner_id(boardingdata.getOwner_id());
        boardingDataBean.setAddress(boardingdata.getAddress());
        boardingDataBean.setName(boardingdata.getName());
        boardingDataBean.setImage_url(boardingdata.getImage_url());
        boardingDataBean.setRoomList(boardingdata.getRooms());

        return boardingDataBean;
    }
}


