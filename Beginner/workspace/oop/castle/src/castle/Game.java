package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
    private HashMap<String, Room> rooms = new HashMap<String, Room>();

    public Game() {
        createRooms();
        handlers.put("help", new HandlerHelp());
        handlers.put("bye", new HandlerBye());
        handlers.put("go", new HandlerGo(this));
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom, kitchen;

        // 制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");



        // 初始化房间的出口
        outside.setExit("west", lobby);
        outside.setExit("south", study);
        outside.setExit("east", pub);
        lobby.setExit("east", outside);
        pub.setExit("west", outside);
        study.setExit("north", outside);
        study.setExit("west", bedroom);
        bedroom.setExit("east", study);

        currentRoom = outside; // 从城堡门外开始
    }

    private void showPrompt() {
        System.out.print("出口有: ");
        System.out.println(currentRoom.getExitsDesc());
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        System.out.println("现在你在" + currentRoom);
        showPrompt();
    }

    // 以下为用户命令
    public void goRoom(String direction) {
        Room nextRoom = currentRoom.getNextRoom(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            System.out.println("你在" + currentRoom);
            showPrompt();
        }
    }

    private void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");

            Handler handler = handlers.get(words[0]);
            String value = "";
            if (words.length > 1) {
                value = words[1];
            }
            if (handler != null) {
                handler.doCmd(value);
                if (handler.isBye()) {
                    break;
                }
            }
        }
        in.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.printWelcome();
        game.play();
        System.out.println("感谢您的光临。再见！");
    }

}
