public class Board {

    private int dimensions;

    private String[][] grid;

    private int[][] monsterLocations = new int[3][2];
    private Monster[] ref = new Monster[3];

    public void init(){
        System.out.println("Creating game board..." + dimensions);
        grid = new String[dimensions][dimensions];
        for(int i = 0; i < this.grid.length; i++){
            for(int j = 0; j < this.grid[i].length; j++){
                this.grid[i][j] = "[ ]";
            }
        }
    }

    public void printBoard(){
        System.out.println("-------------------------------------------------");
        for(int i = 0; i < this.grid.length; i++){
            for(int j = 0; j < this.grid[i].length; j++){
                System.out.print(this.grid[i][j]);
            }
            System.out.print('\n');
        }
    }

    public void placeToken(int x, int y, String token){
        if(x < grid.length && y < grid[0].length){
            grid[x][y] = token;
        }
    }

    public void placeToken(int x, int y, String token, Monster monster){
        if(x < grid.length && y < grid[0].length){
            grid[x][y] = token;
        }
        ref[0] = monster;
    }

    public Monster getMonsterByPos(int x, int y){
        //replace with loop once multiple monsters exist
        return ref[0];
    }

    public boolean updateHero(int prevX, int prevY, int x, int y, Player hero){
        if(this.grid[x][y].equalsIgnoreCase("[M]")){
            if(hero.attack(getMonsterByPos(x, y))){
                return false;
            }
            hero.monstersKilled++;
        }
        this.grid[prevX][prevY] = "[ ]";
        this.grid[x][y] = "[H]";
        return true;
    }

    public Board(int size){
        this.dimensions = size;
    }

}
