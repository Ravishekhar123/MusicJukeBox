import bean.Song;
import  org.junit.After;
import  org.junit.Before;
import  org.junit.Test;

import  static  org.junit.Assert.assertEquals;

public class SongTest {
Song song=new Song();
@Before
public void  setUp() {
    song = new Song(2, "AdhuraIshq", "Altamasfaridi", "Movie", "m2", 4.1, "F:\\MusicJukeBox\\Musicjukebox\\src\\main\\resources\\AdhuraIshq.wav");
}
@After
public void tearDown(){
        song=null;
    }
    @Test
    public  void  SongName(){
    assertEquals("AdhuraIshq",song.getName());
}
}
