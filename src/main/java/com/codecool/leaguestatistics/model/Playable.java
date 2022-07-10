package com.codecool.leaguestatistics.model;

public class Playable {
    private int counter=0;

    public Playable(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        if (counter >0) {
            this.counter--;
        }
    }
}