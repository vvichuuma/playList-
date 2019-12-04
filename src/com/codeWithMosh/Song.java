package com.codeWithMosh;

public class Song {

    private String name;
    private double duration;

    public Song(String name, double duration){
        this.name = name;
        this.duration = duration;
    }

    public String toString(){
        return ("Song name : " + this.name + " and it's duration is : " + this.duration);
    }

}
