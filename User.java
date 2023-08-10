public class User {
    private String name;
    private Channel[] subscribedTo;
    public String getName(){
        return name;
    }

    public Channel[] getSubscribedTo() {
        return subscribedTo;
    }

    public void setName(String n){
        if (n != null && !n.trim().isEmpty()) {
            name = n;
        }
    }

    public void setSubscribedTo(Channel[] subscribedTo) {
        this.subscribedTo = subscribedTo;
    }

}
