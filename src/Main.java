import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(input.trim());
        String regex = input.replaceAll(" ", " ");

        String result = regex;
        System.out.println(result);
    }
}