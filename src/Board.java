public class Board {

    private int dimensions;

    private String[][] grid;

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

    public void updateHero(int prevX, int prevY, int x, int y){
        this.grid[prevX][prevY] = "[ ]";
        this.grid[x][y] = "[H]";
    }

    public Board(int size){
        this.dimensions = size;
    }

}
