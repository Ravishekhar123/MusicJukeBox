import bean.Song;
import dao.PlaylistDao;
import dao.SongDao;
import util.DisplayUtil;
import util.PlayAudioUtil;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class AudioRunner {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------|H|E|L|L|O-|U|S|E|R|------------------------------------------------------");
        System.out.println("|-|-|-|-|-|-|-|-|+|+|+|+|+|+|+|+|+|+|-|-|W|E|L|C|O|M|E|-|T|O|-|J|U|K|B|O|X|-|-|+|+|+|+|+|+|+|+|+|-|-|-|-|-|-|-|-|");
        SongDao songDao = new SongDao();
        PlaylistDao playlistDao = new PlaylistDao();

        List<Song> songList = songDao.getsongList();
        DisplayUtil displayUtil = new DisplayUtil();
        System.out.println("1.Display All Songs");
        System.out.println("2.To Play Song According to Given Id");
        System.out.println("3.Search By");
        System.out.println("4.To Create PlayList");
        System.out.println("5.Exit");
        PlayAudioUtil playAudioUtil = new PlayAudioUtil();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:

                displayUtil.displayCatalogue(songList);
                playAudioUtil.PlaySong(songList);
                break;
            case 2:
                System.out.println("Enter Song Id according to your choice");
                displayUtil.displayCatalogue(songList);
                int songId = scanner.nextInt();
                playAudioUtil.playSong(songId);
                break;
            case 3:
                System.out.println("Search By");

                System.out.println("1.Search By Song Name\n 2. Search By Artist Name\n 3.Search By Album Name \n4.Search By Genre Name");
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Search By Song name");
                        displayUtil.displaySongName(songList);
                        String songName = scanner.next();
                        List<Song> searchlistByName = songDao.searchBySongName(songName);
                        displayUtil.displayCatalogue(searchlistByName);
                        playAudioUtil.PlaySong(searchlistByName);
                        break;
                    case 2:
                        System.out.println("Search By Artist name");
                        displayUtil.displayArtistName(songList);
                        String artistName = scanner.next();
                        List<Song> searchlistByArtistName = songDao.searchByArtistName(artistName);
                        displayUtil.displayCatalogue(searchlistByArtistName);
                        playAudioUtil.PlaySong(searchlistByArtistName);
                        break;

                    case 3:
                        System.out.println("Search By Album Name");
                        displayUtil.displayAlbumName(songList);
                        String albumName = scanner.next();
                        List<Song> searchlistbyAlbumName = songDao.searchByAlbumName(albumName);
                        displayUtil.displayCatalogue(searchlistbyAlbumName);
                        playAudioUtil.PlaySong(searchlistbyAlbumName);
                        break;

                    case 4:
                        System.out.println("Search By Genre name");
                        displayUtil.displayGenreName(songList);
                        String genreName = scanner.next();
                        List<Song> searchbyGenreName = songDao.searchByGenreName(genreName);
                        displayUtil.displayCatalogue(searchbyGenreName);
                        playAudioUtil.PlaySong(searchbyGenreName);
                        System.out.println("Do you want enter 1.Yes 2.No");


                    default:
                        System.out.println("Entered Choice Is Wrong");

                }


            case 4:
                System.out.println("Create PlayList");

                System.out.println("1.To View PlayList");
                int choice3 = scanner.nextInt();

                if (choice3 == 1) {
                    System.out.println("View PlayList");
                    displayUtil.displayCatalogue(songList);
                    playlistDao.createPlayList();
                } else {
                    System.out.println("Your Choice is not the Correct Choice, Enter Correct Choice");
                }
            default:
                System.out.println("Your  Watching Time is More Than You Work!Thank You,You can visit Again");


        }


    }

}