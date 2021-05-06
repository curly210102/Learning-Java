import java.util.Objects;

public class DVD extends Media {
    private String director;

    public DVD(String title, int playingTime, String director) {
        super(title, playingTime, false, "...");
        this.director = director;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.print("DVD ");
        super.print();
        System.out.print(":" + director);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DVD)) {
            return false;
        }
        DVD dVD = (DVD) o;
        return Objects.equals(director, dVD.director);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(director);
    }

    @Override
    public String toString() {
        return "{" + " director='" + this.director + "'" + "}";
    }

}
