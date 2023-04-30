import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // scans in the same line as it is print and not println
        System.out.print("Hi Timmy! Choose a  number to count to: ");
        int timNum = scan.nextInt();
        System.out.println("Great! Here's how it's done");
        for (int i=0; i<=timNum; i++){
            System.out.print(i+" ");
        }
        scan.close();
    }
}
