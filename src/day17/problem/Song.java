package day17.problem;

public class Song {

    String songName ; // 노래 이름

    public Song(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                '}';
    }
}
