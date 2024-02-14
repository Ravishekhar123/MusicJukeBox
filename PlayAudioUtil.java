package util;

import bean.Song;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayAudioUtil {
    Connection connection;

    Scanner scanner = new Scanner(System.in);

    public void playSong(int songId) {
        ConnectionCreatorUtil connectionCreatorUtil = new ConnectionCreatorUtil();
        connection = connectionCreatorUtil.connecttoDatabase();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select Url from song1 where SongId='" + songId + "';");
            String url = "";
            while (resultSet.next()) {
                url = resultSet.getString("url");
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(url));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P=Play,S=Stop,R=Reset,Q=Quit");
                response = scanner.next();
                response = response.toUpperCase();
                switch (response) {
                    case ("P"):
                        clip.start();
                        break;
                    case ("S"):
                        clip.stop();
                        break;
                    case ("R"):
                        clip.setMicrosecondPosition(2);
                        break;
                    case ("Q"):
                        clip.close();
                        break;

                    default:
                        System.out.println("Your Choice is Wrong Enter Correct choice");

                        if (response.equals("Q") || response.equals("q"))
                            break;
                }

            }

        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void PlaySong(List<Song> songList) {
        Iterator<Song> songIterator = songList.listIterator();
        String url = "";
        try {
            while (songIterator.hasNext()) {
                url = songIterator.next().getUrl();
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(url));
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                String response = "";
                while (!response.equals("Q")) {
                    System.out.println("P=Play,S=Stop,R=Reset,Q=Quit,N=Next");
                    response = scanner.next();
                    response = response.toUpperCase();
                    switch (response) {
                        case ("P"):
                            clip.start();
                            break;
                        case ("S"):
                            clip.stop();
                            break;
                        case ("R"):
                            clip.setMicrosecondPosition(1);
                            break;
                        case ("Q"):
                            clip.close();
                            break;
                        case ("N"):
                            clip.close();
                            break;
                        default:
                            System.out.println("Your Choice is Wrong Enter Correct choice");
                    }
                    if (response.equals("Q") || response.equals("q") || response.equals("N") || response.equals("n"))
                        break;
                }
                if (response.equals("Q") || response.equals("q"))
                    break;
            }

        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}