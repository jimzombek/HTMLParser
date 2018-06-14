package com.jmzombek.domain;

import java.util.ArrayList;

public class Chapter {
    private int number;
    private ArrayList<Integer> verses;
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public ArrayList<Integer> getVerses() {
        return verses;
    }
    
    public void setVerses(ArrayList<Integer> verses) {
        this.verses = verses;
    }
}