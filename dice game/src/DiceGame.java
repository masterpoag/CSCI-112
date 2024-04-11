import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    static class Player {
        String name;
        ArrayList<Integer> dice;

        int diceNumber;

        public Player(String name) {
            this.name = name;
            this.dice = new ArrayList<>();
        }

        public int rollDice() {
            this.diceNumber = whatRolled();
            this.dice.add(this.diceNumber);
            return this.diceNumber;
        }

        public static int whatRolled() {
            return rand.nextInt(5) + 1;
        }

        public int showRolled() {
            return this.diceNumber;
        }
    }



       public static void main(String[] args) {
        System.out.println("Welcome to the dice game!");
        Player player1 = new Player(enterName("Player 1"));
        Player player2 = new Player(enterName("Player 2"));
        System.out.println("");
        boolean game = true;
        int dice1; int dice2;
        do{
            for (int i = 0; i < 3; i++) {
                dice1 = player1.rollDice();
                dice2 = player2.rollDice();
                System.out.printf("Roll %d \n%s rolled a %d\n %s rolled a %d\n",i,player1.name,dice1,player2.name,dice2);
            }
            won(player1.name,player2.name,sum(player1.dice),sum(player2.dice));
            System.out.println("Would you like to play again? (Y/N)");
            switch (scanner.nextLine().toUpperCase().charAt(0)){
                case('Y'):
                    player1.dice = new ArrayList<>();
                    player2.dice = new ArrayList<>();
                    break;
                case('N'):
                    game = false;
                    break;
            }

        }while(game);
    }
    public static void won(String name1, String name2, int val1, int val2) {
        String word= "";
        if(val1 > val2)word = name1+ " won!";
        if(val1 < val2)word = name2+ " won!";
        if(val1 == val2)word = name1+ " and "+name2+ " Tied.";
        System.out.printf("%s scored: %d\n%s scored: %d \nthat means that %s\nThats a difference of %d points!\n",name1,val1,name2,val2,word,(Math.abs(val1-val2)));
    }

    public static int sum(ArrayList<Integer> values){
        int total = 0;
        for(int adding : values){
            total+=adding;
        }
        return total;
    }
    public static String enterName(String name) {
        System.out.printf("Enter %s's name\n",name);
         return scanner.nextLine();
    }
}
