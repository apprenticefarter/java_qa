package ru.igorek.addressbook.appmanager;

public class ContactData {
    private final String firstname;
    private final String midllename;
    private final String lastname;
    private final String nickname;
    private final String address;
    private final String phonenumber;

    public ContactData(String firstname, String midllename, String lastname, String nickname, String address, String phonenumber) {
        this.firstname = firstname;
        this.midllename = midllename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.phonenumber = phonenumber;
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
}
