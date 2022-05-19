package com.example.footBinApp.entities;

public class Player {
    private int playerId;
    private String FirstName;
    private String LastName;


    private int price;
    private String position;
    private int age;
    private String country;
    private int height;
    private int number;
    private String photo;
    private int Club_clubId;

    public Player() {
    }

    public Player(int playerId, String firstName, String lastName, int price, String position, int age, int height, int number, String photo, int club_clubId) {
        this.playerId = playerId;
        FirstName = firstName;
        LastName = lastName;
        this.price = price;
        this.position = position;
        this.age = age;
        this.height = height;
        this.number = number;
        this.photo = photo;
        Club_clubId = club_clubId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getClub_clubId() {
        return Club_clubId;
    }

    public void setClub_clubId(int club_clubId) {
        Club_clubId = club_clubId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", price=" + price +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", height=" + height +
                ", number=" + number +
                ", photo='" + photo + '\'' +
                ", Club_clubId=" + Club_clubId +
                '}';
    }
}
