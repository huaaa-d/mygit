package org.example.pojo;

public class User {

    private String number;
    private String major;
    private int grade;
    private String name;
    private String sex;
    private String phone;
    private int number_1;
    private String position;


    public User() {
    }

    public User(String number, String major, int grade, String name, String sex, String phone, int number_1, String position) {
        this.number = number;
        this.major = major;
        this.grade = grade;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.number_1 = number_1;
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumber_1() {
        return number_1;
    }

    public void setNumber_1(int number_1) {
        this.number_1 = number_1;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "number='" + number + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", number_1=" + number_1 +
                ", position='" + position + '\'' +
                '}';
    }
}
