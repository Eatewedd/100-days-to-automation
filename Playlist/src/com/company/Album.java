package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song song = new Song(songTitle, songDuration);
        if (findSong(songTitle) == null) {
            songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String songTitle) {
        //instantiates a customer object and gives it a value of the first indexed name
        for (Song song : this.songs) { //triggers popping every index number from the ArrayList
            if (song.getTitle().equals(songTitle)) {
                System.out.println(song + " is on the album");//if the name(String) that popped out equals the parameter name(String)
                return song;
            }
        }
        System.out.println("Song not on the album");
        return null;
    }

   /* public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {

        ListIterator<Song> songListIterator = playlist.listIterator();
        while (songListIterator.hasNext()) {
            int comparison = songListIterator.next().compareTo(trackNumber);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(trackNumber + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                songListIterator.previous();
                songListIterator.add(trackNumber);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        songListIterator.add(trackNumber);
        return true;
    }*/

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = findSong(songTitle);
        if(findSong(songTitle) != null) { //if the song is not on the album
          playList.add(song);
          return true;
        }
        return false;
    }
}






