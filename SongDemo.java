import bean.Song;
import util.ConnectionCreatorUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongDemo {
    static  Connection connection;


    public List<Song>getSonglist() throws SQLException

    {


        String value = "Songname";
        List<Song> songlist = new ArrayList<>();
        String sql = "select * from Song1 where " + value + "';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Song song=new Song();
            int songId=resultSet.getInt(1);
            String songName=resultSet.getString(2);
            String artistName=resultSet.getString(3);
            String albumName=resultSet.getString(4);
            String genreName=resultSet.getString(5);
            Double duration=resultSet.getDouble(6);
            song=new Song(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getDouble(6));
            songlist.add(song);
            System.out.println(songlist);
        }
        return songlist;

    }



}
