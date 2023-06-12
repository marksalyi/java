import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs;

    private String name;

    private int current;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
        this.current = 0;
    }

    public void addSong(Song song){
        this.songs.add(song);
        System.out.println("Added a new song " + song);
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void printList(){
        Iterator<Song> iterator = this.songs.iterator();
        System.out.println("====================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("====================");
    }

    public void removeSong(){
        Song removedSong = this.songs.removeFirst();
        System.out.println("Removed song: " + removedSong);

    }

    public void removeSongByPosition(int position){

        this.songs.remove(position);

    }

    public void playNext() {
        if (this.songs.size() > 0) {
            Song currentSong = this.songs.get(current);
            System.out.println("PLaying: " + currentSong);
        }
        if (current < this.songs.size()-1) {
            current++;
        }
    }


    public void playPrevoius(){
        if((current > 0) && this.songs.size() > 0){
            current--;
            Song currentSong = this.songs.get(current);
            System.out.println("Playing: " + currentSong);
        }

    }

    // git commit push
}
