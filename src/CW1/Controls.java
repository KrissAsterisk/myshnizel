package CW1;

import helpers.InputReader;

public class Controls {

    public String options(){
        return "1 - Print all recorded songs\n2 - Add a song\n3 - Remove a song\n4 - Edit the number of plays\n5 - Exit the program\n";
    }

    public void printSongs(String Playlist, int playCount, int i){
        System.out.println(i + ") " + Playlist + "\n      (played " + playCount + " times)\n");
    }

    public String addSong(){
        return InputReader.getString("Enter the name of the song in the following format\n<name of song> - <name of author>\n");
    }

    public int addPlays(){
        return InputReader.getInt("Enter the number of times the song has been played: ");
    }

    public int removeSong(){
        return InputReader.getInt("Which song would you like to remove?");
    }

    public int[] editPlays(){
        int[] edit = new int[2];
        edit[0] = InputReader.getInt("Which song would you like to edit?");
        edit[1] = InputReader.getInt("What is the new number of plays?");
        return edit;
    }
}
