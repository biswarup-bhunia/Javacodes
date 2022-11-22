package BasicJava.Evalutation4.day14.question2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        PlayList p = new PlayList();
        while (true) {

            System.out.println("Press 1. you want to add a new song");
            System.out.println("Press 2. you want to Exit this program");
            System.out.println();
            System.out.println("Enter your choice");
            int N = user.nextInt();

            if (N == 1) {
                System.out.println("Enter MovieName ..");
                user.nextLine();
                String movieName = user.nextLine();
                System.out.println("Enter SongName ..");
                String songName = user.nextLine();

                p.addSong(new Song(movieName, songName));

            } else {
                List<Song>	s1 = p.songs ;
                for (Song song : s1) {
                    song.play();

                }
                System.out.println("Thank you for visiting our program !..");
                break;
            }
        }

        //


    }
    }

