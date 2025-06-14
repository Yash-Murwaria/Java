import model.VoteManager;
import model.Candidate;
import model.Voter;
import data.FileStorage;
import utils.InputValidator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VoteManager manager = FileStorage.load();

        while (true) {
            System.out.println("\n🗳️ Voting Menu:");
            System.out.println("1. Register Voter");
            System.out.println("2. Add Candidate");
            System.out.println("3. Start Voting");
            System.out.println("4. Cast Vote");
            System.out.println("5. View Results");
            System.out.println("6. Stop Voting");
            System.out.println("7. Save & Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter voter name: ");
                    String name = scanner.nextLine();
                    if (!InputValidator.isValidName(name)) {
                        System.out.println("❌ Invalid name.");
                        break;
                    }
                    int id = manager.registerVoter(name);
                    System.out.println("✅ Voter ID: " + id);
                }
                case 2 -> {
                    System.out.print("Enter candidate name: ");
                    String name = scanner.nextLine();
                    if (!InputValidator.isValidName(name)) {
                        System.out.println("❌ Invalid name.");
                        break;
                    }
                    int id = manager.addCandidate(name);
                    System.out.println("✅ Candidate ID: " + id);
                }
                case 3 -> manager.startVoting();
                case 4 -> {
                    if (!manager.isVotingOpen()) {
                        System.out.println("❌ Voting is closed.");
                        break;
                    }
                    System.out.print("Enter your Voter ID: ");
                    int voterId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Candidate ID: ");
                    int candidateId = Integer.parseInt(scanner.nextLine());
                    boolean success = manager.castVote(voterId, candidateId);
                    System.out.println(success ? "✅ Vote cast." : "❌ Vote failed.");
                }
                case 5 -> manager.showResults();
                case 6 -> manager.stopVoting();
                case 7 -> {
                    FileStorage.save(manager);
                    System.out.println("✅ Saved. Exiting.");
                    return;
                }
                default -> System.out.println("❌ Invalid option.");
            }
        }
    }
}