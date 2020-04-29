package ru.igorek.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String midllename;
    private final String lastname;
    private final String nickname;
    private final String address;
    private final String phonenumber;
    private String group;

    public ContactData(String firstname, String midllename, String lastname, String nickname, String address,
                       String phonenumber,String group) {
        this.firstname = firstname;
        this.midllename = midllename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMidllename() {
        return midllename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getGroup() {
        return group;
    }
}
