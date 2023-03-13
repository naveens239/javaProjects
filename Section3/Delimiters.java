import java.util.Scanner;
public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter two integers and enter them in the same line");
        int integer1 = scan.nextInt();
        int integer2 = scan.nextInt();

        System.out.println("\nEnter two very big integers and enter them in the same line");
        long long1 = scan.nextLong();
        long long2 = scan.nextLong();

        System.out.println("\nEnter two decimals and enter them in the same line");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("\nEnter two text values and enter them in the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\t Integers:  "+ integer1 + " "+ integer2);
        System.out.println("\t Big Integers:  "+ long1 + " "+ long2);
        System.out.println("\t Decimals:  "+ decimal1 + " "+ decimal2);
        System.out.println("\t Words:  "+ text1 + " "+ text2);

    }
}
