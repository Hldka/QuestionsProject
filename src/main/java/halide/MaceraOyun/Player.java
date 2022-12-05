package halide.MaceraOyun;

public class Player extends Game{
    public Player(int damage, int healthy, int money, String name) {
        this.damage = damage;
        this.healthy = healthy;
        this.money = money;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int damage;
 int healthy;
int  money;
String  name;

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "damage=" + damage +
                ", healthy=" + healthy +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
