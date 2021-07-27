package com.example.rentaride;

public class userhelper {
    private String fname, sname;
    private Double IDnum;
    private Double DLnum;
    private Double phonenum;
    private String email;

    public userhelper(){


    }

    public userhelper(String fname, String sname, Double IDnum, Double DLnum, Double phonenum,String email) {
        this.fname = fname;
        this.sname = sname;
        this.IDnum = IDnum;
        this.DLnum = DLnum;
        this.phonenum = phonenum;
        this.email=email;
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
