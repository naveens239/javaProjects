import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the Java Dealership");
        System.out.println("\n. Select option 'a' to buy a car");
        System.out.println("\n. Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("What is your budget? ");
                int budget = scan.nextInt();
                if (budget >=10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no' ");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no' ");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int score = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && score > 660 ){
                        System.out.println("\nSold !! Pleasure doing business with you");
                    } else{
                        System.out.println("\nWe're sorry. You are not eligible.");
                    }

                }else {
                    System.out.println("\nWe don't sell cars under $10,000. Sorry!");
                }
            break;
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int sellingPrice = scan.nextInt();

                if (sellingPrice > value && sellingPrice < 30000){
                    System.out.println("\nWe will buy your car. Pleasure doing business with you");
                }else {
                    System.out.println("\nSorry we are not interested.");
                }
                
            break;
            default: System.out.println("Invalid option"); break;
        }
        scan.close();
    }
}
