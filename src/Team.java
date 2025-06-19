import java.util.ArrayList;
import java.util.List;

public class Team {
    private int code;
    private List<Player> players;

    public Team() {
        code    = 0;
        players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }
}