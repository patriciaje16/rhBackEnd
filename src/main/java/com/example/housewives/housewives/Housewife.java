package com.example.housewives.housewives;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Housewife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int housewifeId;
    private String name;
    private String placeOfResidence;
    private String seasonsPresent;
    private String currentRelationshipStatus;
    private String famousQuote;

    public Housewife() {

    }

    public Housewife(int housewifeId, String name, String placeOfResidence, String seasonsPresent, String currentRelationshipStatus, String famousQuote) {
        this.housewifeId = housewifeId;
        this.name = name;
        this.placeOfResidence = placeOfResidence;
        this.seasonsPresent = seasonsPresent;
        this.currentRelationshipStatus = currentRelationshipStatus;
        this.famousQuote = famousQuote;
    }

    public int getHousewifeId() {
        return housewifeId;
    }

    public void setHousewifeId(int housewifeId) {
        this.housewifeId = housewifeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getSeasonsPresent() {
        return seasonsPresent;
    }

    public void setSeasonsPresent(String seasonsPresent) {
        this.seasonsPresent = seasonsPresent;
    }

    public String getCurrentRelationshipStatus() {
        return currentRelationshipStatus;
    }

    public void setCurrentRelationshipStatus(String currentRelationshipStatus) {
        this.currentRelationshipStatus = currentRelationshipStatus;
    }

    public String getFamousQuote() {
        return famousQuote;
    }

    public void setFamousQuote(String famousQuote) {
        this.famousQuote = famousQuote;
    }
}
