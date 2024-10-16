package podcastApp;

public class Podcast {
    String title;
    double duration;

    public Podcast(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public double getDuration(){
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title= " + title + '\'' +
                ", duration= " + duration +"Min"+
                '}';
    }
}
