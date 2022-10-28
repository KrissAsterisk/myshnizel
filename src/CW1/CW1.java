package CW1;
import helpers.InputReader;
import java.util.ArrayList;



public class CW1 {


    public static void main(String[] args) {
        int choice;
        Controls controls = new Controls();
        ArrayList<String> Playlist = new ArrayList<>();
        ArrayList<Integer> playCount = new ArrayList<>();
        Playlist.add("tonight - JKER");
        Playlist.add("CANT HAVE IT - JKER");
        playCount.add(14667148);
        playCount.add(7436992);
        System.out.println("Welcome, here are the controls to your new Playlist Maker.");

        do {
            try{
            choice = InputReader.getInt(controls.options());
            if (choice == 1) {
                if (Playlist.isEmpty()){
                    System.out.println("There are no songs present in this playlist.");
                } else {
                for (int i = 0; i < Playlist.size(); i++) {
                    controls.printSongs(Playlist.get(i), playCount.get(i), i);
                    }
                }
            } else if (choice == 2) {
                Playlist.add(controls.addSong());
                playCount.add(controls.addPlays());
            } else if (choice == 3){
                int songNumber = controls.removeSong();
                Playlist.remove(songNumber);
                playCount.remove(songNumber);
                System.out.println("The song number " + songNumber + " has been deleted");
            } else if (choice == 4){
                int[] edit = controls.editPlays();
                playCount.set(edit[0], edit[1]);
            } else if (choice == 5){
                System.out.println("Goodbye!");
                System.exit(0);
            }

            } catch (IndexOutOfBoundsException e){ // no iteration needed if error caught (line 23,27 from controls)
                System.out.println("\nThere is no song with this number, please try again.\n\n");
            }
        }while(true);
    }
}

