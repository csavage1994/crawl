public class Monster {

    public int health;
    public int x;
    public int y;
    public boolean isAlive;
    public String token;

    public boolean checkStatus(){
        if(this.health <= 0){
            this.isAlive = false;
        }
        return this.isAlive;
    }

    public Monster(int health, String token){
        this.health = health;
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
        this.token = token;
        this.isAlive = true;
    }
}
