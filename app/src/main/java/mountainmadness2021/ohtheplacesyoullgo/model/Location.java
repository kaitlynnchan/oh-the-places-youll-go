package mountainmadness2021.ohtheplacesyoullgo.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Location {
    private String city;
    private String country;
    private double estimatedCost;
    private String [] attractions;
    private String fact;

    public Location(String city, String country, String [] attractions, String fact) {
        this.city = city;
        this.country = country;
        this.attractions = attractions;
        this.fact = fact;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public Iterable<String> attractions() {
        return new Iterable<String>() {
            @NonNull
            @Override
            public Iterator<String> iterator() {
                return Collections.unmodifiableCollection(Arrays.asList(attractions)).iterator();
            }
        };
    }

    public String getFact() {
        return fact;
    }
}
