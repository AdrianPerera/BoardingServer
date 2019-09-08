package com.boarding.serverAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class BoardingOwner {
   @Id
   private ObjectId _id;
   private String first_name;
   private String last_name;
   private String DOB;
   private String contact_no;
   private String address;

   public BoardingOwner(ObjectId _id,String first_name,String last_name,String DOB,String contact_no,String address){

      this._id=_id;
      this.first_name=first_name;
      this.last_name=last_name;
      this.DOB=DOB;
      this.contact_no=contact_no;
      this.address=address;



   }

   public String  get_id() {
      return _id.toHexString();
   }

   public void set_id(ObjectId _id) {
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
}
