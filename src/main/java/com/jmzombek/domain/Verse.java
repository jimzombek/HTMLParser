package com.jmzombek.domain;

public class Verse {
    private int number;
    private String passage;
    private boolean jesusSpeaking;
    
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getPassage() {
        return passage;
    }
    
    public void setPassage(String passage) {
        this.passage = passage;
    }
    
    public boolean isJesusSpeaking() {
        return jesusSpeaking;
    }
    
    public void setJesusSpeaking(boolean jesusSpeaking) {
        this.jesusSpeaking = jesusSpeaking;
    }
}
