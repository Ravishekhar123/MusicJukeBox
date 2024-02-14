package dao;

import bean.Song;
import util.ConnectionCreatorUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SongDao {
    Connection connection;

    public List getsongList() throws SQLException {

        ConnectionCreatorUtil connectionCreatorUtil = new ConnectionCreatorUtil();
        connection = connectionCreatorUtil.connecttoDatabase();
        List<Song> songList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from Song1");
        while (resultSet.next()) {
            Song song = new Song();
            song.setId(resultSet.getInt(1));
            song.setName(resultSet.getString(2));
            song.setAlbumName(resultSet.getString(3));
            song.setArtistName(resultSet.getString(4));
            song.setGenreName(resultSet.getString(5));
            song.setDuration(resultSet.getInt(6));
            song.setUrl(resultSet.getString(7));
            //song = new Song(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7));
            songList.add(song);

        }
        return songList;
    }

    public List<Song> searchBySongName(String name) throws SQLException {
        List<Song> searchList = new ArrayList<>();
        String value = "SongName";
        String sql = "Select * from song1 where  "+value+ "  like '%"+name+"%';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int SongId = resultSet.getInt(1);
            String SongName = resultSet.getString(2);
            String ArtistName = resultSet.getString(3);
            String AlbumName = resultSet.getString(4);
            String GenreName = resultSet.getString(5);
            Double Duration = resultSet.getDouble(6);
            String Url = resultSet.getString(7);
            Song songs = new Song(SongId, SongName, ArtistName, AlbumName, GenreName, Duration, Url);
            searchList.add(songs);
        }
        if (searchList.size() == 0) {
            throw new RuntimeException();
        }
        return searchList;
    }

    public List<Song> searchByArtistName(String name) throws SQLException {
        List<Song> searchList = new ArrayList<>();
        String value = "ArtistName";
        String sql = "Select * from song1 where  "+value+ "  like '%"+name+"%';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            Song song=new Song();
            int SongId = resultSet.getInt(1);
            String SongName = resultSet.getString(2);
            String ArtistName = resultSet.getString(3);
            String AlbumName = resultSet.getString(4);
            String GenreName = resultSet.getString(5);
            Double Duration = resultSet.getDouble(6);
            String Url = resultSet.getString(7);
            song = new Song(SongId, SongName, ArtistName, AlbumName, GenreName, Duration, Url);
            searchList.add(song);
        }
        return searchList;
    } public List<Song> searchByAlbumName(String name) throws SQLException {
        List<Song> searchList = new ArrayList<>();
        String value = "AlbumName";
        String sql = "Select * from song1 where  "+value+ "  like '%"+name+"%';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int SongId = resultSet.getInt(1);
            String SongName = resultSet.getString(2);
            String ArtistName = resultSet.getString(3);
            String AlbumName = resultSet.getString(4);
            String GenreName = resultSet.getString(5);
            Double Duration = resultSet.getDouble(6);
            String Url = resultSet.getString(7);
            Song song = new Song(SongId, SongName, ArtistName, AlbumName, GenreName, Duration, Url);
            searchList.add(song);
        }
        return searchList;
    }
    public List<Song> searchByGenreName(String name) throws SQLException {
        List<Song> searchList = new ArrayList<>();
        String value = "GenreName";
        String sql = "Select * from song1 where  "+value+ "  like '%"+name+"%';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int SongId = resultSet.getInt(1);
            String SongName = resultSet.getString(2);
            String ArtistName = resultSet.getString(3);
            String AlbumName = resultSet.getString(4);
            String GenreName = resultSet.getString(5);
            Double Duration = resultSet.getDouble(6);
            String Url = resultSet.getString(7);
            Song song = new Song(SongId, SongName, ArtistName, AlbumName, GenreName, Duration, Url);
            searchList.add(song);
        }
        return searchList;
    }


}
