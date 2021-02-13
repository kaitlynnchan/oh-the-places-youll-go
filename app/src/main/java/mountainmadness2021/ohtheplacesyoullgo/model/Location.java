package mountainmadness2021.ohtheplacesyoullgo.model;

import java.util.ArrayList;

public class Location {
    private String city;
    private String country;
    private double estimatedCost;
    private String [] attractions;

    public Location(String city, String country, String [] attractions) {
        this.city = city;
        this.country = country;
        this.attractions = attractions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public String[] getAttractions() {
        return attractions;
    }

    public void setAttractions(String [] attractions) {
        this.attractions = attractions;
    }
}
