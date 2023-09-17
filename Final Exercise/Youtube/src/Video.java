public class Video implements VideoOptions{
    private String title;
    private int reviews = 1, views = 1, likes;
    private boolean playing;

    public Video(String title){
        this.setTitle(title);
        this.setReviews(1);
        this.setViews(1);
        this.setLikes(0);
        this.playing = false;
    }
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {

        this.reviews = (reviews + this.getReviews()) /this.getViews(); //calc average of reviews
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {

        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", reviews=" + reviews +
                ", views=" + views +
                ", likes=" + likes +
                ", playing=" + playing +
                '}';
    }
}
