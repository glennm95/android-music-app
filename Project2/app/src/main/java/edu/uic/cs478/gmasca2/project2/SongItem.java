package edu.uic.cs478.gmasca2.project2;



/**
 * Created by Glenn on 27-Feb-18.
 */

public class SongItem
{
    private String songName;
    private String songArtist;
    private String songWiki;
    private String artistWiki;
    private String songVideo;

    public SongItem(String songName, String songArtist, String songWiki, String artistWiki, String songVideo)
    {
        this.songName = songName;
        this.songArtist = songArtist;
        this.songWiki = songWiki;
        this.artistWiki = artistWiki;
        this.songVideo = songVideo;
    }

    public String getSongName() { return songName; }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getSongWiki() {
        return songWiki;
    }

    public void setSongWiki(String songWiki) {
        this.songWiki = songWiki;
    }

    public String getArtistWiki() {
        return artistWiki;
    }

    public void setArtistWiki(String artistWiki) {
        this.artistWiki = artistWiki;
    }

    public String getSongVideo() {
        return songVideo;
    }

    public void setSongVideo(String songVideo) {
        this.songVideo = songVideo;
    }

}
