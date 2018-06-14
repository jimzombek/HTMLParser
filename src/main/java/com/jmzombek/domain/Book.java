package com.jmzombek.domain;

import java.util.ArrayList;

public class Book {

    private enum testament {
        OLD, NEW
    }
    private String name;
    private String author;
    private ArrayList<Chapter> chapters;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public ArrayList<Chapter> getChapters() {
        return chapters;
    }
    
    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }
}
