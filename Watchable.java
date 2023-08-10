public interface Watchable extends Likeable{
String getTitle();
User getCreator();
int getLength();
Comment[] getComments();
Video[] getRecommended();
void setTitle(String x);
void setCreator(User x);
void setLength(int x);
void setComments(Comment[] x);
void setRecommended(Video[] x);

}
