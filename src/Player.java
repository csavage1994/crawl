public class Player {

    public int health;
    private int strength;
    public int x;
    public int y;
    public int prevX;
    public int prevY;
    public boolean alive = true;
    public int monstersKilled = 0;

    public boolean attack(Monster monster){
        monster.health--;
        this.health--;
        return monster.checkStatus();
    }

    private void moveUp(){
        if(this.x > 0){
            this.prevX = this.x;
            this.prevY = this.y;
            this.x--;
        }
    }

    private void moveDown(){
        if(this.x < 9){
            this.prevX = this.x;
            this.prevY = this.y;
            this.x++;
        }
    }

    private void moveLeft(){
        if(this.y > 0){
            this.prevX = this.x;
            this.prevY = this.y;
            this.y--;
        }
    }

    private void moveRight(){
        if(this.y < 9){
            this.prevX = this.x;
            this.prevY = this.y;
            this.y++;
        }
    }

    private void rest(){
        this.alive = false;
    }

    public void handleInput(String input){
        if(input.equalsIgnoreCase("w")){
            this.moveUp();
        } else if(input.equalsIgnoreCase("s")){
            this.moveDown();
        } else if(input.equalsIgnoreCase("a")){
            this.moveLeft();
        } else if(input.equalsIgnoreCase("d")){
            this.moveRight();
        } else{
            this.rest();
        }
    }

    public Player(){
        this.health = 20;
        this.strength = 1;
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
        this.prevX = this.x;
        this.prevY = this.y;
    }
}
