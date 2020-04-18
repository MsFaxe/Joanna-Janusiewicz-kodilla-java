package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        //Collectors.joining()
        /*String theResultStringOfBooks = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.getYearOfProduction() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        //Collectors.toMap()
        /*Map <String, Book> theResultMapOfBook = theBookDirectory.getTheBookList().stream()
                .filter(book -> book.yearOfPublication() >2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBook.size());
        theResultMapOfBook.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


        //Collectors.toList()
        /*List<Book> theResultListOFBook = theBookDirectory.getTheBookList()
                .stream()
                .filter(book -> book.yearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOFBook.size());
        theResulrListOFBook.stream().forEach(System.out::println);*/


        //"book" package
        /*BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getTheBookList().stream()
                .filter(book -> book.yearOfPublication() > 2005)
                .forEach(System.out::println);*/


        //"person" package
        /*People.getList().stream().
                map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/
    }
}
