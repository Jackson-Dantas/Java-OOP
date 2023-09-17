public class Visualization {
    private Gafanhoto viewer;
    private Video video;

    public Visualization(Gafanhoto viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        this.viewer.setWatchTotal(this.viewer.getWatchTotal()+1);
        this.video.setViews(this.video.getViews()+1);
    }

    public void rate(){
        this.video.setReviews(this.video.getReviews()+ 5);
    };
    public void rate(int rate){
        this.video.setReviews(rate + this.video.getReviews());
    }

    public void rate(double percentRate){ }

    public Gafanhoto getViewer() {
        return viewer;
    }

    public void setViewer(Gafanhoto viewer) {
        this.viewer = viewer;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", video=" + video +
                '}';
    }
}
