public class Comment implements Likeable, Comparable{
private int likes;
private int dislikes;
private String content;

public Comment (String v, int l, int d) {
    if (v != null && !v.trim().isEmpty()) {
        content = v;
    }
    else {
        content = "";
    }
    if (l >= 0 ) {
        likes = l;
    }
    else {
        likes = 0;
    }
    if (d >= 0) {
        dislikes = d;
    }
    else {
        dislikes = 0;
    }
}

public Comment (String v) {
        this(v,0,0);
}
public String getContent() {
    return content;
}
public int getLikes() {
    return likes;
}
public int getDislikes() {
    return dislikes;
}

    public void setContent(String content) {
        this.content = content;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public int compareTo(Object o) {
        Comment c = (Comment) o;
        int rating1 = this.getLikes() - this.getDislikes();
        int rating2 = c.getLikes() - c.getDislikes();
        if (rating1 == rating2) {
            return 0;
        }
        return (rating1 - rating2);
    }

    public String toString(){
    String s = "";
    s = "The comment of \""+this.getContent() + "\" ";
    s = s + "has " + this.getLikes() + " likes and ";
    s = s + this.getDislikes() + " dislikes.";
    return s;
    }

    public boolean equals(Object o){
    Comment c;
    if ( o == null) {
        return false;
    }
    if (!(o instanceof Comment)){
        return false;
    }
    c = (Comment) o;
    if (content.equals(c.content)) {
        if (likes == (c.getLikes())){
            if(dislikes == (c.getDislikes())) {
                return true;
            }
        }
    }
    return false;
    }
}