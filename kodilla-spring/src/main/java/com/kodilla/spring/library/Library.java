package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service
public final class Library {
    private final List<String> books = new ArrayList<>();

    //3rd injection method - field
//    @Autowired
    private LibraryDbController libraryDbController;

    //1st injection method - constructor
//    @Autowired
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    //2nd injection method - setter
//    @Autowired
//    public void setLibraryDbController(LibraryDbController libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
