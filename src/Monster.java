public class Monster {

    public int health;
    public int x;
    public int y;
    public boolean isAlive;
    public String token;

    public Monster(int health, String token){
        this.health = health;
        this.x = (int) (Math.random() * 11);
        this.y = (int) (Math.random() * 11);
        this.token = token;
        this.isAlive = true;
    }
}
