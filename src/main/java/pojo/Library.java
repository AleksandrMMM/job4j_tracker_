package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("War", 1000);
        Book book2 = new Book("War2", 1002);
        Book book3 = new Book("War3", 1003);
        Book book4 = new Book("Clean Code", 1004);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        List<Book> bookList = new ArrayList<Book>();
        bookList = Arrays.asList(books);

        for (Book bb: bookList) {
            System.out.println(bb.getName());
        }
        System.out.println();
        for (Book bo: books) {
            System.out.println(bo.getName());
        }
        System.out.println();
        Book bookTemp = books[0];
        books[0] = books[3];
        books[3] = bookTemp;

        for (Book boo: books) {
            System.out.println(boo.getName());
        }

        for (Book b: books) {
            if ("Clean Code".equals(b.getName())) {
                System.out.println(b.getName());
        }

        }

    }


}
