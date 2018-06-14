package com.jmzombek.domain;

import java.util.ArrayList;

public class Bible {

    private enum translation {NIV, KJV}
    private enum language {ENGLISH, SPANISH}
    private ArrayList<Book> books;
    
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
