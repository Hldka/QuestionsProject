package halide.MaceraOyun;

public abstract class  Location {
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Player player;
    private String name;

    public void location(){}
    public abstract boolean onLocation();


}
