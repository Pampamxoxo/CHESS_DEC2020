public class Player{
    private Player name;
    private Player status;
    private Player level;

    public Player(Player name, Player status, Player level) {
        this.name = name;
        this.status = status;
        this.level = level;
    }

    public Player getName() {
        return name;
    }

    public Player getStatus() {
        return status;
    }

    public Player getLevel() {
        return level;
    }

    public void setName(Player name) {
        this.name = name;
    }

    public void setStatus(Player status) {
        this.status = status;
    }

    public void setLevel(Player level) {
        this.level = level;
    }
}
