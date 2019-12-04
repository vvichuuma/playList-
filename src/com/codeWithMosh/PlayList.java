package com.codeWithMosh;

import java.util.LinkedList;

public class PlayList {

    private String name;
    private LinkedList<Song> playList;

    public PlayList(String name){
        this.name = name;
        this.playList = new LinkedList<Song>();
    }

    public void addSongs(Song song){
        this.playList.add(song);
    }

    public LinkedList<Song> getPlayList(){
        return this.playList;
    }
}
