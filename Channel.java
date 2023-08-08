import java.util.Arrays;
import java.util.Objects;

public class Channel {
    private int subscribers;
    private String creationDate;
    private String title;
    private Video[] videos;

    public Channel (String t, String c, int s, Video[] v) {
        if (t != null && !t.trim().isEmpty()){
            title = t;
        }
        else {
            title = "Untitled";
        }
        if (c == null || c.trim().isEmpty() || c.length() != 8) {
            creationDate = "N/A";
        }
        else {
           creationDate = c;
        }
        if (s < 0) {
            subscribers = 0;
        }
        else {
            subscribers = s;
        }
        if (v == null) {
         videos = new Video[0];
        }
        else {
            videos = v;
        }
    }

    public Channel (String t) {
        this(t,"N/A", 0, null );
    }

    public Channel (String t, Video[] v ) {
        this(t,"N/A", 0, v);
    }

    public Channel (String t, String c) {
        this(t, c, 0,null);
    }

    public Channel (String t, String c, Video[] v) {
        this(t,c,0,v);
    }

    public String getTitle() {
        return title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public Video[] getVideos() {
        return videos;
    }
public void setSubscribers(int s) {
    if (s < 0) {
        subscribers = 0;
    }
    else {
        subscribers = s;
    }
}
public void setCreationDate(String c) {
    if (c == null || c.trim().isEmpty() || c.length() != 8) {
        creationDate = "N/A";
    }
    else {
        creationDate = c;
    }
}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "subscribers=" + subscribers +
                ", creationDate='" + creationDate + '\'' +
                ", title='" + title + '\'' +
                ", videos=" + Arrays.toString(videos) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return subscribers == channel.subscribers && Objects.equals(creationDate, channel.creationDate) && Objects.equals(title, channel.title) && Arrays.equals(videos, channel.videos);
    }

}
