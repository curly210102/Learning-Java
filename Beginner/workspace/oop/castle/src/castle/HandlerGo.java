package castle;

/**
 * HandlerGo
 */
public class HandlerGo extends Handler {
    private Game game;

    public HandlerGo(Game game) {
        this.game = game;
    }

    @Override
    public void doCmd(String value) {
        game.goRoom(value);
    }
}