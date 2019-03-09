package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository//Bean odpowiedzialny za przechowywanie danych w
// trwałych zbiorach( bazach danych)
public class LibraryDbController {
    public void saveData(){
        System.out.println("Saving data to the database");
    }

    public void loadData(){
        System.out.println("Loading data from the database");
    }
}
