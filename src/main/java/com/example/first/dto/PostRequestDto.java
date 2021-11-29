package com.example.first.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
    private String account;
    private String email;
    private String address;
    private String passward;
    @JsonProperty("phone_number") // 겍체의 변수 이름과 json에서 받아오는 값이 다를 때 사용함
    private String phoneNumber;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", passward='" + passward + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
