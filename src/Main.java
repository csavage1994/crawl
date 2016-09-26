import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init variables
        Player hero = new Player();
        Board gameBoard = new Board(10);
        Monster firstMonster = new Monster(1, "[M]");
        Boolean playing = true;
        String input;
        Scanner scanner = new Scanner(System.in);

        //setup initial state
        gameBoard.init();
        gameBoard.placeToken(hero.x, hero.y, "[H]");
        gameBoard.placeToken(firstMonster.x, firstMonster.y, firstMonster.token);
        gameBoard.printBoard();

        //start game loop
        while(playing){
            input = scanner.nextLine();
            hero.handleInput(input);
            if(!hero.alive){
                playing = false;
            }
            gameBoard.updateHero(hero.prevX, hero.prevY, hero.x, hero.y);
            //System.out.println(hero.prevX + " " + hero.prevY + " " + hero.x + " " + hero.y);
            gameBoard.printBoard();
        }
    }
}
