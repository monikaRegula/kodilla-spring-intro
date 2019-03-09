package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//Bean udostępniający bardziej złożone usługi
public final class Library {

    private final List<String> books = new ArrayList<>();

//wstrzykiwanie zależności przez konstruktor Dependency Injection

   private LibraryDbController libraryDbController;

    public Library() {
    }

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController =libraryDbController;
    }

    public void saveToDb(){
        libraryDbController.saveData();
    }

    public void loadFromDb(){
        libraryDbController.loadData();
    }
}
