package ru.igorek.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;

    private final String firstname;
    private final String midllename;
    private final String lastname;
    private final String nickname;
    private final String address;
    private final String phonenumber;
    private String group;

    public ContactData(int id, String firstname, String midllename, String lastname, String nickname, String address,
                       String phonenumber, String group) {
        this.id = id;
        this.firstname = firstname;
        this.midllename = midllename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.group = group;
    }
    public ContactData(String firstname, String midllename, String lastname, String nickname, String address,
                       String phonenumber, String group) {
        this.id = 0;
        this.firstname = firstname;
        this.midllename = midllename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "ContactData{" +
                "firstname='" + firstname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(firstname, that.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname);
    }

}
