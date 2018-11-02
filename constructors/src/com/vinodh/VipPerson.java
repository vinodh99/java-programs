package com.vinodh;

public class VipPerson {
    private String name;
    private double creditlimit;
    private String emailAddress;

    public VipPerson(){
        this("default name",50000.00, "default@emailaddress");
    }

    public VipPerson(String name, double creditlimit) {
        this(name,creditlimit,"email@default.com");
        this.name = name;
        this.creditlimit = creditlimit;
    }

    public VipPerson(String name, double creditlimit, String emailAddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
