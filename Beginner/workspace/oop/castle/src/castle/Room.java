package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String dir, Room exit) {
        exits.put(dir, exit);
    }

    public String getExitsDesc() {
        StringBuffer sb = new StringBuffer();
        for (String dir : exits.keySet()) {
            sb.append(dir);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Room getNextRoom(String direction) {
        return exits.get(direction);
    }

    @Override
    public String toString() {
        return description;
    }
}
