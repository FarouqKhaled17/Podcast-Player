package podcastApp;

import java.util.ArrayList;

public class Playlist {
    private String Author;
    private String Description;
    private ArrayList<Podcast> podcasts;

    public Playlist(String author, String description, ArrayList<Podcast>podcasts){
        this.Author = author;
        this.Description = description;
        this.podcasts =podcasts;
    }
}
