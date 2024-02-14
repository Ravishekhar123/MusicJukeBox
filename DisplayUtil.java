package util;

import bean.Song;


import java.util.List;


public class DisplayUtil {


    public void displayCatalogue(List<Song> songList) {
        System.out.println("***************************************************************************************");
        System.out.printf("|\t%-5s|\t%-21s|\t%-17s|\t%-16s|\t%-17s|\t%-10s\n", "SongId", "SongName", "ArtistName", "AlbumName", "GenreName", "SongDuration");

        for (Song song : songList) {
            System.out.printf("|\t%-5d|\t%-21s|\t%-17s|\t%-16s|\t%-17s|\t%-10s\n", song.getId(), song.getName(), song.getArtistName(), song.getAlbumName(), song.getGenreName(), song.getDuration());
        }
    }
    public  void displaySongName(List<Song> songList){
        System.out.println("Hi welcome");
        for (Song song:songList){
            System.out.println(song.getName());
        }
    }
    public void displayArtistName(List<Song> songList){
        System.out.println("Welcome");
        for (Song song:songList){
            System.out.println(song.getArtistName());
        }
    }
    public void displayAlbumName(List<Song> songList){
        System.out.println("Welcome");
        for (Song song:songList){
            System.out.println(song.getAlbumName());
        }
    }
    public  void displayGenreName(List<Song> songList){
        System.out.println("Hello");
        for (Song song:songList){
            System.out.println(song.getGenreName());
        }

    }


}
