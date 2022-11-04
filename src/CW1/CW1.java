package CW1;
import helpers.ConsoleColours;
import helpers.InputReader;

import java.io.IOException;
import java.util.ArrayList;



public class CW1 {


    private static final ArrayList<Song> SongList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int choice;
        Controls controls = new Controls(SongList);

        //adding the songs to the playlist
        Song song1 = new Song("JKER", "tonight",14667148, SongList.size());
        SongList.add(song1);

        Song song2 = new Song("JKER", "CANT HAVE IT",7436992, SongList.size());
        SongList.add(song2);

        Song song3 = new Song("Bring Me The Horizon", "Kingslayer", 93418426, SongList.size());
        SongList.add(song3);

        Song song4 = new Song("Lyn", "You Are Stronger", 1370807, SongList.size());
        SongList.add(song4);

        Song song5 = new Song("Billie Eilish", "wish you were gay", 676590870, SongList.size());
        SongList.add(song5);

        Song song6 = new Song("9 Gramm", "Плановая", 1821861, SongList.size());
        SongList.add(song6);

        Song song7 = new Song("Rauf & Faik", "Детство", 140086725, SongList.size());
        SongList.add(song7);

        Song song8 = new Song("Saba", "Ziplock", 15744444, SongList.size());
        SongList.add(song8);

        Song song9 = new Song("Joji", "Gimme Love", 291508620, SongList.size());
        SongList.add(song9);


        System.out.println("Welcome, here are the controls to your new Playlist Maker.");

        do {
            try{
                //asks user for input
                choice = InputReader.getInt(controls.options());


            if (choice == 1) {
                if (SongList.isEmpty()){
                        System.out.println("There are no songs present in this playlist.");
                } else {

                    controls.printSongs();

                }

            } else if (choice == 2) {

                    controls.addSong();

            } else if (choice == 3){

                controls.removeSong();


            } else if (choice == 4){

                controls.editPlays();


            } else if (choice == 5){

                controls.printPopularSongs();

            } else if (choice == 6){

                System.exit(0);

            }

            } catch (IndexOutOfBoundsException e){ // to check whenever we delete or edit songs
                System.out.println("\n" + ConsoleColours.ANSI_RED + "There is no song with this number, please try again." + ConsoleColours.ANSI_RESET + "\n");
            }
        }while(true);
    }
}

