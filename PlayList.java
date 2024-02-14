package bean;

import java.util.*;

public class PlayList {
private  int id;
private  String playlistName;
private String dateofCreation;
private ArrayList<Song>songArrayList;

public  PlayList(){

}

    public PlayList(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
    }

    public  PlayList(int id, String playlistName, String dateofCreation){
    this.id=id;
    this.playlistName=playlistName;
    this.dateofCreation=dateofCreation;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getDateofCreation() {
        return dateofCreation;
    }

    public void setDateofCreation(String dateofCreation) {
        this.dateofCreation = dateofCreation;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void setSongArrayList(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "id=" + id +
                ", playlistName='" + playlistName + '\'' +
                ", dateofCreation='" + dateofCreation + '\'' +
                ", songArrayList=" + songArrayList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList = (PlayList) o;
        return id == playList.id && playlistName.equals(playList.playlistName) && dateofCreation.equals(playList.dateofCreation) && songArrayList.equals(playList.songArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playlistName, dateofCreation, songArrayList);
    }
}

