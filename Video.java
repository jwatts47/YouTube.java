/**
 * Video class for the YouTube Project.
 * @author Jaylen Watts
 * @version 1.0
 */
public class Video implements Watchable{
    private String title;
    private User creator;
    private int likes;
    private int dislikes;
    private Video[] recommended;
    private Comment[] comments;
    private int length;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getLength() {
        return length;
    }

    public Comment[] getComments() {
        return comments;
    }

    @Override
    public int getDislikes() {
        return dislikes;
    }

    @Override
    public int getLikes() {
        return likes;
    }

    public User getCreator() {
        return creator;
    }

    public Video[] getRecommended() {
        return recommended;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public void setRecommended(Video[] recommended) {
        this.recommended = recommended;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
