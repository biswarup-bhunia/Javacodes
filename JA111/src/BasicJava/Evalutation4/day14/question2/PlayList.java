package BasicJava.Evalutation4.day14.question2;

import java.util.*;

public class PlayList {
    public List<Song> songs = new ArrayList<Song>();
    public void addSong(Song song){
//        for (Song sng: songs
//             ) {
//            if(song!=sng){
//                songs.add(song);
//                System.out.println("Song added to the playlist successfully.");
//            }
//            else System.out.println("Song is already added in the playlist");
//
//        }
        for (int i = 0 ; i< songs.size() ; i++){
            Song song1 = songs.get(i);
            if(song1.equals(song)){
                System.out.println("Song is already added in the playlist");
                return;
            }
        }
        songs.add(song);
        System.out.println("Song added to the playlist successfully.");
    }
}
