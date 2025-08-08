
import java.util.ArrayList;
import java.util.Scanner;

public class votingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int BJP = 0, congress = 0, AAP = 0, SP = 0;
        
       
       
        ArrayList<String> voters = new ArrayList<>(); // to store names of voters

        do {
            System.out.println("Welcome to Voting System");
            sc.nextLine();
            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            // Check if the person already voted
            if (voters.contains(name)) {
                System.out.println("You have already voted. Duplicate voting is not allowed.");
            } else {
                // Allow voting
                voters.add(name); // store name

                System.out.print(
                        "Enter your choice: \n1. Bhartiya Janta Party\n2. Congress\n3. Samajwadi Party\n4. Aam Aadmi Party\nYour vote: ");
                int number = sc.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("You voted for Bhartiya Janta Party");
                        BJP++;
                        break;
                    case 2:
                        System.out.println("You voted for Congress");
                        congress++;
                        break;
                    case 3:
                        System.out.println("You voted for Samajwadi Party");
                        SP++;
                        break;
                    case 4:
                        System.out.println("You voted for Aam Aadmi Party");
                        AAP++;
                        break;
                    default:
                        System.out.println("Invalid choice. You didn't vote.");
                        break;
                }
            }

            System.out.print("Do you want to continue to vote? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for voting!");

        // Displaying the leaderboard of the party
        System.out.println("------- Final Vote Count ------");
        System.out.println("Total number of votes of BJP party: " + BJP);
        System.out.println("Total number of votes of Congress party: " + congress);
        System.out.println("Total number of votes of AAP party: " + AAP);
        System.out.println("Total number of votes of SP party: " + SP);

        // Display the winner after voting ends
        System.out.println("\n--- Election Result ---");
        if (BJP > congress && BJP > AAP && BJP > SP) {
            System.out.println("Winner of the election is Bhartiya Janta Party");
        } else if (congress > BJP && congress > AAP && congress > SP) {
            System.out.println("Winner of the election is Congress Party");
        } else if (AAP > BJP && AAP > congress && AAP > SP) {
            System.out.println("Winner of the election is Aam Aadmi Party");
        } else if (SP > BJP && SP > congress && SP > AAP) {
            System.out.println("Winner of the election is Samajwadi Party");
        } else {
            System.out.println("It's a Tie or No clear winner!");
            System.out.println("Need to form a coalition government to form the government");
        }

        // Show all voter names
        System.out.println("\nList of Voters:");
        for (String voter : voters) {
            System.out.println("- " + voter);
        }

    }
}