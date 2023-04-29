import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("Enter three  numbers between 1 and 6: ");
    int userPick1 = scanner.nextInt();
    int userPick2 = scanner.nextInt();
    int userPick3 = scanner.nextInt();
    
    scanner.close ();

    if (isLessThanOne(userPick1, userPick2, userPick3) || isGreaterThanSix(userPick1, userPick2, userPick3)){
        System.out.println("You entered values outside the valid range.");
        System.exit(0);
    }
    int sumRolls = roll1 + roll2 + roll3;
    int sumUserPicks = userPick1 +userPick2 + userPick3;

    System.out.println("Your sum is: "+sumUserPicks + " and Computer sum is :"+sumRolls);

    boolean win =  checkWin(sumUserPicks, sumRolls);
    if(win == true){
        System.out.println("Congratulations !! You win");
    }else {
        System.out.println("Better luck next time.");
    }

    }
    public static boolean isLessThanOne(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }
    public static boolean isGreaterThanSix(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }
    public static int rollDice(){
        double randomNumber = Math.random() * 6; //0 - 5.999999
        randomNumber += 1; // 1 - 6.999999
        return (int)randomNumber; // 1-6
    }


    public static boolean checkWin (int sumUserPicks, int sumRolls){
        return ((sumUserPicks > sumRolls) && (sumUserPicks - sumRolls) < 3);
    }

}
