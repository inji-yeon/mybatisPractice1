package com.ohgiraffers.member.model;

public class MemberDTO {

    private int code;
    private String name;
    private String birthDate;
    private String info;
    private String contact;
    private String activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birthDate, String info, String contact, String activeStatus) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.info = info;
        this.contact = contact;
        this.activeStatus = activeStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", info='" + info + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
