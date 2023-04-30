import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
       System.out.print("1. Pick a number to count by: ");
       int skipBy = scan.nextInt();
       System.out.print("2. Pick a number to start counting from: ");
       int countFrom = scan.nextInt();
       System.out.print("3. Pick a number to start counting to: ");
       int countTo = scan.nextInt();
       counter(skipBy,countFrom,countTo);
       scan.close();
    }
    public static void counter(int skipBy, int countFrom, int countTo ){
        for (int i=countFrom; i<=countTo; i+=skipBy){
            System.out.print(i+" ");
        }
    }
}
