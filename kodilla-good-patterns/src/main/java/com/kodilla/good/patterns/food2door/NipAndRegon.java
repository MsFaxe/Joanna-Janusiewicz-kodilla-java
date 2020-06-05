package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class NipAndRegon {

    private final String nipNumber;
    private final String regonNumber;

    public NipAndRegon(String nipNumber, String regonNumber) {
        this.nipNumber = nipNumber;
        this.regonNumber = regonNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NipAndRegon that = (NipAndRegon) o;
        return nipNumber == that.nipNumber &&
                regonNumber == that.regonNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nipNumber, regonNumber);
    }

    @Override
    public String toString() {
        return "nipNumber=" + nipNumber +
                ", regonNumber=" + regonNumber;
    }
}
