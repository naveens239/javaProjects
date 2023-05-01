public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1;
        int dice2;
        dice1 = diceRoll();
        dice2 = diceRoll();

        while (dice1 != dice2){
            dice1 = diceRoll();
            dice2 = diceRoll();
            System.out.println("Dice 1: "+dice1);
            System.out.println("Dice 2: "+dice2 +"\n");
        }
        System.out.println("You rolled Doubles!");
    }

    public static int diceRoll(){
        int roll = 0;
        roll = (int) (Math.random()*6)+1;
        return roll;
    }
}





