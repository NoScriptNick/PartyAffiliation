import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        String party;

        System.out.println("Enter your party affiliation:");
        party = scan.nextLine();
        if (party.equals("D")) {
            System.out.println("You get a Democrat Donkey!");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person");
        } else {
            System.out.println("THAT'S NOT A PARTY I HAVE STORED IN MY SYSTEM!!!!!!!!!");
        }
    }
}