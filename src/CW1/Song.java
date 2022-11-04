package CW1;



/**
 * This class is used as an identifier for ArrayList
 */
public class Song {

    @Override  // override the hashcode to appear as values.  could use get methods to print everything
    public String toString() {
        return "\n"+ id + ") " + authorName + " - " + title + ": "+ playCount +" plays.\n";
    }


        private int id;

        private String authorName;

        private String title;

        private int playCount;

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Song(String authorName, String title, int playCount, int id){
            this.authorName = authorName;
            this.title = title;
            this.playCount = playCount;
            this.id = id;
        }

}
