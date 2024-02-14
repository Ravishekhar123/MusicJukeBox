package bean;

import java.util.Objects;

public class Song {
    private int id;
    private String name;
    private String artistName;
    private String albumName;
    private String genreName;
    private double duration;
    private String url;

    public Song() {

    }

    public Song(int anInt, String string, String string1, String string2, String string3, double aDouble) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Song(int id, String name, String artistName, String albumName, String genreName, double duration, String url) {
        this.id = id;
        this.name = name;
        this.albumName = albumName;
        this.artistName = artistName;
        this.genreName = genreName;
        this.duration = duration;
        this.url = url;


    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", genreName='" + genreName + '\'' +
                ", duration=" + duration +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && Double.compare(song.duration, duration) == 0 && name.equals(song.name) && artistName.equals(song.artistName) && albumName.equals(song.albumName) && genreName.equals(song.genreName) && url.equals(song.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, artistName, albumName, genreName, duration, url);

    }
}



