import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String party;

        System.out.println("What is your party [D,R,I]");
        party = scan.nextLine();
        switch (party) {
            case "D":
                System.out.println("You get a Democratic Donkey");
                break;
            case "R":
                System.out.println("You get a Republican Elephant");
                break;
            case "I":
                System.out.println("You get an Independent Person");
                break;
            default:
                System.out.println("You are Communists ");
                break;
        }
    }
}