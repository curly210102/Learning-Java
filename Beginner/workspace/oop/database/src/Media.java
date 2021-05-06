public class Media {
    private String title;
    private int playingTime;
    private String comment;
    private Boolean gotIt;

    public Media(String title, int playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.comment = comment;
        this.gotIt = gotIt;
    }

    public void print() {
        System.out.print(title);
    }

}
