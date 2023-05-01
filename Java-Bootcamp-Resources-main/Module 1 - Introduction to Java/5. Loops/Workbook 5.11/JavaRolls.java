import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diceRoll = 0;
        int score = 0;
        // See Learn the Part for detailed instructions.
        System.out.println("Let's play Rolling Java. Press enter to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("1. If you roll a 6, the game stops.");
        System.out.println("2. If you roll a 4, nothing happens.");
        System.out.println("3. Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();

        while (diceRoll !=6 ){
            diceRoll = rollDice();
            System.out.print("\nYou rolled a "+diceRoll+".");
            if (diceRoll == 6) {
                System.out.println(" End of game. ");
                break;
            }else if (diceRoll == 4){
                System.out.println(" Zero points. Keep rolling.");
            }else{
                score += 1;
                System.out.println(" One point. Keep rolling.");
            }
        }
        if (score >= 3){
            System.out.print("You scored "+score+". ");
            System.out.println("Wow, that's lucky. You win!");
        } 
        else{
            System.out.print("You scored "+score+". ");
            System.out.println("Tough luck, you lose :(");
        }
    }
    /**
     * Function name: rollDice
     * @return randomNumber (int)
     *
     * Inside the function:
     *  - return a random number between one and six. 
     */
    public static int rollDice() {
        int randomNumber;
        randomNumber = (int)(Math.random()*6)+1;
        return randomNumber;
    }
  
}
