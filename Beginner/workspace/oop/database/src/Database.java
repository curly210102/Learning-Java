import java.util.ArrayList;

public class Database {
    ArrayList<Media> db = new ArrayList<Media>();

    public void add(Media media) {
        db.add(media);
    }

    public void remove(int index) {
        db.remove(index);
    }

    public void list() {
        for (Media media : db) {
            media.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();

        db.add(new CD("A", 100, "a"));
        db.add(new CD("B", 200, "b"));
        db.add(new CD("C", 300, "c"));
        db.add(new DVD("D", 23000, "d"));
        db.list();
    }
}
