package org.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private final List<String> genres;

    Book() {
        this.genres = new ArrayList<>();
    }

    Book(String name, String author, String[] genres) {
        this.name = name;
        this.author = author;
        this.genres = new ArrayList<>(Arrays.asList(genres));
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getGenre() {
        return genres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addGenre(String genre) {
        genres.add(genre);
    }

    public void showInfo() {
        System.out.printf("\nName:   %s", name);
        System.out.printf("\nAuthor: %s", author);
        System.out.printf("\nGenres: %s", genres);
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAuthor: " + author +
                "\nGenres: " + genres;
    }
}
