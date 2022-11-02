package com.Wayne_01_dom4j;

/*
    <contact id="1" vip="true">
        <name>   潘金莲  </name>
        <gender>女</gender>
        <email>panpan@itcast.cn</email>
    </contact>
*/
public class Contact {
    private String name;
    private int id;
    private boolean vip;
    private char gendar;
    private String email;

    public Contact() {
    }

    public Contact(String name, int id, boolean vip, char gendar, String email) {
        this.name = name;
        this.id = id;
        this.vip = vip;
        this.gendar = gendar;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public char getGendar() {
        return gendar;
    }

    public void setGendar(char gendar) {
        this.gendar = gendar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", vip=" + vip +
                ", gendar=" + gendar +
                ", email='" + email + '\'' +
                '}';
    }
}
