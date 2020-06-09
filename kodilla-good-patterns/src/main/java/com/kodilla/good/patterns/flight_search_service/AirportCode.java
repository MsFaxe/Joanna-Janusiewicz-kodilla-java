package com.kodilla.good.patterns.flight_search_service;

import java.util.Objects;

public class AirportCode {

     private final String code;

     public AirportCode(String code) {
          this.code = code;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          AirportCode that = (AirportCode) o;
          return code.equals(that.code);
     }

     @Override
     public int hashCode() {
          return Objects.hash(code);
     }

     @Override
     public String toString() {
          return code;
     }
}
