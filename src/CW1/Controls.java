package CW1;

import helpers.ConsoleColours;
import helpers.InputReader;


import java.util.ArrayList;

/**
 * This class is used to get input from the user to add values to the playlist in the main class
 */
public class Controls{


    ArrayList<Song> Playlist;

    public Controls(ArrayList<Song> playlist){
        this.Playlist = playlist;

    }

    // to use as a prompt for InputReader
    public String options(){
        return "1 - Print all recorded songs\n2 - Add a song\n3 - Remove a song\n4 - Edit the number of plays\n5 - Show popular songs\n6 - Exit the program\n";
    }

    // NOT used to iterate the ArrayList -- outdated version
    public void printSongs(){

            System.out.println(Playlist.toString());

    }

    // used to add a song to the playlist
    public void addSong(){

        String name = InputReader.getString("Enter the name of author: ");
        String title = InputReader.getString("Enter the name of the song: ");
        int playCount = InputReader.getInt("Enter the play count: ");

        Song song = new Song(name, title, playCount, Playlist.size());
        Playlist.add(song);
        System.out.println(title + " by "+ name +" has been added to the playlist. \n");
    }

    public void checkId(){
        for(int i = 0; i < Playlist.size(); i++) {
            Playlist.get(i).setId(i);
        }
    }

    public void removeSong(){
        int songNumber = (InputReader.getInt("Which song would you like to remove? "));
        Playlist.remove(songNumber);
        System.out.println(ConsoleColours.ANSI_RED + "The song number " + songNumber + " has been deleted." + ConsoleColours.ANSI_RESET);

        checkId();

    }

    public void editPlays(){
        int songNumber = (InputReader.getInt("Which song would you like to edit? "));
        Playlist.get(songNumber).setPlayCount(InputReader.getInt("What is the new number of plays? "));

        System.out.println("Song edited: \n" +  Playlist.get(songNumber).toString());

    }

    // new method to iterate the Playlist
    public void printPopularSongs(){
        for(int i = 0; i<Playlist.size(); i++) {
            int song1 = Playlist.get(i).getPlayCount();
            if (song1 >100000000){
               System.out.println(Playlist.get(i).toString());
            }
            }
        }
    }


