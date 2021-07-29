package com.example.rentaride;

public class userhelper {
    private final String fname;
    private final String sname;
    private final Double IDnum;
    private final Double DLnum;
    private final Double phonenum;
    private final String email;


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
