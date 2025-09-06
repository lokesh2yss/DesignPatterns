package behavioral.iterator;

import behavioral.iterator.interfaces.IterableCollection;
import behavioral.iterator.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IterableCollection<String> {
    private final List<String> songs = new ArrayList<>();
    public void addSong(String song) {
        songs.add(song);
    }
    public String getSongAt(int index) {
        return songs.get(index);
    }
    public int getSize() {
        return songs.size();
    }
    @Override
    public Iterator<String> createIterator() {
        return new PlaylistIterator(this);
    }
}
