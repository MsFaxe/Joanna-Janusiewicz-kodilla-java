package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, String peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = new BigDecimal(peopleQuantity);
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + countryName + '\'' +
                ", quantityOfPeople=" + peopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return countryName.equals(country1.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }
}
