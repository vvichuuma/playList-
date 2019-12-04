package com.codeWithMosh;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Mp3 or Music List:
        //A user can add a song to the playList:
        //can shuffle between songs.
        //add/delete a song from playList.

        PlayList playList = new PlayList("Code Motivation");
        playList.addSongs(new Song("Hacker's Theme", 3.14));
        playList.addSongs(new Song("Social Network theme", 12.10));
        playList.addSongs(new Song("Dark Coder" , 7.3));
        playList.addSongs(new Song("Code Motivation", 10.14));

        LinkedList<Song> mp3List = playList.getPlayList();
        ListIterator<Song> listIterator = mp3List.listIterator();

        boolean code = true;
        boolean forward = true;
        printMenu();
        while(code){
            System.out.println("Please enter an option");
            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt){
                case 0:
                    //Turns off the power
                    System.out.println("Power off..");
                    code = false;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing : " + listIterator.next().toString());

                    }else{
                        System.out.println("We reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:

                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing : " + listIterator.previous().toString());
                    }else{
                        System.out.println("We reached the beginning of the list");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                        System.out.println("Now Playing : " + listIterator.previous().toString());
                        forward = false;
                    }else if(!forward){
                        System.out.println("Now Playing : " + listIterator.next().toString());
                        forward = true;
                    }

                    break;
                case 4:
                    //Prints the entire playlist:
                    printList(mp3List);
                    break;
                case 5:
                    printMenu();
                    break;
            }

        }

    }

   public static void printMenu(){
       System.out.println("0 - To turn off the player");
       System.out.println("1 - To move to next song");
       System.out.println("2 - To move to previous song");
       System.out.println("3 - To replay a song");
       System.out.println("4 - To print the song list");
       System.out.println("5 - To print the menu options");
   }


    public static void printList(LinkedList<Song> linkedList){

        Iterator<Song> iterator = linkedList.iterator();

        System.out.println("==================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("===================");

    }

}
