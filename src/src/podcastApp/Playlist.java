package podcastApp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private String author;
    private String description;
    private String title;
    private ArrayList<Podcast> podcasts;

    public Playlist(String author, String description) {
        this.author = author;
        this.description = description;
        this.podcasts = new ArrayList<>();
    }

    public Playlist() {
        this.podcasts = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Podcast> getAllPodcasts() {
        return podcasts;
    }

    // Check if a podcast with the given title already exists
    public Podcast isExist(String title) {
        for (Podcast existPod : podcasts) {
            if (existPod.getTitle().equals(title))
                return existPod;
        }
        return null;
    }

    // Add a podcast if it doesn't already exist
    public boolean addPodcast(Podcast pod) {
        if (isExist(pod.getTitle()) == null) {
            podcasts.add(pod);
            System.out.println("Podcast " + pod.getTitle() + " added successfully");
            return true;
        } else {
            System.out.println("Podcast " + pod.getTitle() + " addition failed because it's already in the list");
            return false;
        }
    }

    // Add a podcast to a playlist by track number
    public boolean addToPlaylist(int trackNum, LinkedList<Podcast> playlist) {
        int index = trackNum - 1;
        if (index >= 0 && index < this.podcasts.size()) {
            Podcast podcast = this.podcasts.get(index);
            playlist.add(podcast);
            System.out.println("Podcast " + podcast.getTitle() + " added to the playlist.");
            return true;
        }
        System.out.println("This playlist doesn't have a track number " + trackNum);
        return false;
    }

    // Add a podcast to a playlist by podcast title
    public boolean addToPlaylist(String title, LinkedList<Podcast> playlist) {
        for (Podcast podcast : this.podcasts) {
            if (podcast.getTitle().equals(title)) {
                playlist.add(podcast);
                System.out.println("Podcast " + podcast.getTitle() + " added to the playlist.");
                return true;
            }
        }
        System.out.println("Podcast with title " + title + " not found in the list.");
        return false;
    }
}
