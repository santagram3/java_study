package day17.problem;


import com.kh.hw.member.model.vo.Member;

import java.util.*;

public class ArtistList {


    Map<String,Artist> songList; //

    public ArtistList() {
        songList = new HashMap<>();
        songList.put("동방신기",new Artist());
        songList.put("ss501",new Artist());
        songList.put("여자친구",new Artist());
        songList.put("소녀시대",new Artist());
    }




    // 메서드
    public int  howMany() {
        // 실제 저장된 회원의 수
       int a = songList.size();
        return a;
    }
    //



}
