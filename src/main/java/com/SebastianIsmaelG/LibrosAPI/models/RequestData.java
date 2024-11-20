package com.SebastianIsmaelG.LibrosAPI.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RequestData(
        @JsonAlias("results")List<BooksData> books

) {
    @Override
    public String toString() {
        return "Resultado libros =" + books ;
    }
}
