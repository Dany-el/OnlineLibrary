package org.library;

public class User {
    void showLibrary(Library library) {
        for (Book book :
                library.getBooks()) {
            book.showInfo();
            System.out.println();
        }
    }

    void findBookInfoByName(Library library, String bookName) {
        for (Book book :
                library.getBooks()) {
            if (bookName.equalsIgnoreCase(book.getName())) {
                book.showInfo();
                return;
            }
        }
    }

}
