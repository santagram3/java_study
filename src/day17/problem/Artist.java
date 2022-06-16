package day17.problem;

import java.util.ArrayList;
import java.util.List;

public class Artist {


    List<Song> songList; // 가수가 부른 노래

    public Artist() {
       songList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Artist{" +
                "songList=" + songList +
                '}';
    }
}
