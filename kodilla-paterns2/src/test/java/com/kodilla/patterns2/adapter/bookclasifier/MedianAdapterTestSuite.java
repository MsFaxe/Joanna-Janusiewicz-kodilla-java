package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
//        for (int i = 1; i >= 5; i++) {
//            bookSet.add(new Book("title"+i, "author"+i, 2000+i, "a"+i));
//        }
        bookSet.add(new Book("title", "author", 2001, "a1"));
        bookSet.add(new Book("title", "author", 2002, "a2"));
        bookSet.add(new Book("title", "author", 2003, "a3"));
        bookSet.add(new Book("title", "author", 2004, "a4"));
        bookSet.add(new Book("title", "author", 2005, "a5"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        for (Book book: bookSet){
            System.out.println(book);
        }
        assertEquals(2003, median);
    }
}