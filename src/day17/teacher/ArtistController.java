
package day17.teacher;

import day17.teacher.*;
import day18.api.io.obj.Human;

import java.io.*;
import java.util.*;

public class ArtistController {

    // key는 가수명을 사용
    private Map<String, Artist> artistMap;

    // 유일하게 만들기 위해 싱글톤
    // 다른 객체에서 직접 생산 하지 못하게
    // 1. private으로 제한을 걸어두고 static 으로 유일하게 만든다
//    그리고 그걸 내부에서 만드는 코드
//    private static ArtistController ac;

    // 2. 그리고 static 으로 감싸서 static 안에서 생성한다

    private static ArtistController ac;

    static {
        ac = new ArtistController();
    }


    private ArtistController() {
        artistMap = new HashMap<>();
    }


    // 싱글턴 객체 반환
    public static ArtistController getInstance() {
        return ac;
    }


    // list를 set으로 변환
    public Set<String> convert(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    // 가수 신규 등록 기능
    public void insertNewArtist(Artist artist) {
        artistMap.put(artist.getName(), artist);
    }

    // 등록 가수 노래목록에 노래 추가 기능
    public boolean addNewSong(String artistName, String songName) {
        // 노래 목록 얻기
        List<String> songList = artistMap.get(artistName).getSongs();
        // 중복 확인을 위한 set 변환
        Set<String> songSet = convert(songList);
        // 노래 넣고 결과 얻기
        boolean result = songSet.add(songName);

        // set에 성공적으로 저장되었다면 중복이 아닌 노래이므로 리스트에 저장
        if (result) songList.add(songName);

        // 노래 넣기 성공 유무 결과 반환
        return result;
    }

    // 가수가 등록되어 있는지 유무 확인
    public boolean isRegister(String artistName) {
        return artistMap.containsKey(artistName);
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistMap.size();
    }

    // 특정 가수 노래 목록 반환
    public List<String> getSongList(String artistName) {
        return artistMap.get(artistName).getSongs();
    }

    // 세이브 파일 저장할 디렉토리 생성
    public void makeDirectory() {
        File dir = new File("E:/music");
        if (!dir.exists()) dir.mkdirs();
    }

    //세이브 기능
    public void save() {


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/music/m.sav"))) {

            oos.writeObject(artistMap);
//            java.io.NotSerializableException: day18.api.io.obj.Human
//            직렬 화가 안된다고 7

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로드 기능
    public void load() {

        File file = new File("E:/music/m.sav");

        if (file.exists()) {
            try (ObjectInputStream ois
                         = new ObjectInputStream(new FileInputStream("E:/music/m.sav"))) {

                artistMap = (Map<String, Artist>) ois.readObject();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }




}