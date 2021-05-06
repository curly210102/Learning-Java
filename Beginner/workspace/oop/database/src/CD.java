import java.util.Objects;

public class CD extends Media {
    private String artist;

    public CD(String title, int playingTime, String artist) {
        super(title, playingTime, false, "...");
        this.artist = artist;
    }

    public void print() {
        System.out.print("CD ");
        super.print();
        System.out.println(":" + artist);
    }

    @Override
    public String toString() {
        return "{" + " artist='" + this.artist + "'" + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CD)) {
            return false;
        }
        CD cD = (CD) o;
        return Objects.equals(artist, cD.artist);
    }

    public static void main(String[] args) {
        CD cd1 = new CD("Holy", 180, "Bieber");
        CD cd2 = new CD("Holy", 180, "Bieber");
        System.out.println(cd1);
        System.out.println(cd1.toString());
        System.out.println(cd1.equals(cd2));

        DVD dvd1 = new DVD("Tenet", 10800, "Nolan");
        System.out.println(dvd1);
        System.out.println(dvd1.toString());
        System.out.println(cd1.equals(dvd1));
    }
}
