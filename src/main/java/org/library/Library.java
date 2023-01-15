package org.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    Library() {
        books = new ArrayList<>();
        books.add(new Book("1984", "George Orvel", new String[]{"Science fiction", "Politic fiction", "Anti-utopia", "Social fiction"}));
        books.add(new Book("Metro 2033", "Dmitry Glukhovsky", new String[]{"Novel", "Science fiction", "Apocalyptic and post-apocalyptic"}));
        books.add(new Book("Metro 2034", "Dmitry Glukhovsky", new String[]{"Novel", "Science fiction", "Apocalyptic and post-apocalyptic"}));
        books.add(new Book("Metro 2035", "Dmitry Glukhovsky", new String[]{"Novel", "Science fiction", "Apocalyptic and post-apocalyptic"}));
        books.add(new Book("Silkworm", "Robert Galbraith", new String[]{"Crime", "Fiction", "Novel"}));
        books.add(new Book("The Cuckoo’s Calling", "Robert Galbraith", new String[]{"Crime", "Fiction", "Novel"}));
        books.add(new Book("Career of evil", "Robert Galbraith", new String[]{"Crime", "Fiction", "Novel"}));
    }

    public static void main(String[] args) {
        Library library = new Library();

        User user = new User();
        user.showLibrary(library);
        user.findBookInfoByName(library, "Metro 2035");
    }

    public List<Book> getBooks() {
        return books;
    }
}