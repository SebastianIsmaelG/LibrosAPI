package com.SebastianIsmaelG.LibrosAPI.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorsData(
        @JsonAlias("name") String name,
        @JsonAlias("birth_year") String birth_year

) {
    @Override
    public String toString() {
        return "Name: " + name +"| Birth of year: " + birth_year;
    }
}
