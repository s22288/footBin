package com.example.footBinApp.entities;

import java.time.LocalDate;

public class League {

    private Long id;
    private String name;
    private String country;
    private LocalDate creationDate;
    private int numberOfTeams;
    private String lastWinner;
    private String logoUrl;

    public League(Long id, String name, String country, LocalDate creationDate, int numberOfTeams, String lastWinner, String logoUrl) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.creationDate = creationDate;
        this.numberOfTeams = numberOfTeams;
        this.lastWinner = lastWinner;
        this.logoUrl = logoUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    public String getLastWinner() {
        return lastWinner;
    }

    public void setLastWinner(String lastWinner) {
        this.lastWinner = lastWinner;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", creationDate=" + creationDate +
                ", numberOfTeams=" + numberOfTeams +
                ", lastWinner='" + lastWinner + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                '}';
    }
}
