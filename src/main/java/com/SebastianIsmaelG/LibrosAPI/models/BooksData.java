package com.SebastianIsmaelG.LibrosAPI.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BooksData(
        @JsonAlias("title") String title,
        @JsonAlias("authors")List<AuthorsData> authors,
        @JsonAlias("languajes")List<String> languages,
        @JsonAlias("download_count")Double download_count

) {
    @Override
    public String toString() {
        return "Title : " + title +
               ", Authors: " + authors +
               ", Language: " + languages +
               ", Downloads: " + download_count;
    }
}
