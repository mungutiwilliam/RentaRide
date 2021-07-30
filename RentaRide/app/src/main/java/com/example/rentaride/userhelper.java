package com.example.rentaride;

public class userhelper {
     String fname,sname,email;
     Double IDnum,DLnum,phonenum;

    userhelper()
    {

    }


    public userhelper(String namef, String nameS, Double num, Double Dnum, Double phone,String mail) {
        this.fname = namef;
        this.sname = nameS;
        this.IDnum = num;
        this.DLnum = Dnum;
        this.phonenum = phone;
        this.email=mail;
    }

    public String getFname() {

        return fname;
    }

    public String getSname() {

        return sname;
    }

    public Double getIDnum() {

        return IDnum;
    }

    public Double getDLnum() {

        return DLnum;
    }

    public Double getPhonenum() {

        return phonenum;
    }

    public String getEmail() {

        return email;
    }
}
