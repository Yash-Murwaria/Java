import java.util.*;

public class VotingSystem {

    
}lass OnlineVotingSystem {

    private static Map<Integer, String> voters = new HashMap<>();
    private static Map<Integer, String> candidates = new HashMap<>();
    private static Map<Integer, Integer> votes = new HashMap<>();
    private static boolean votingOpen = false;
    private static int nextVoterId = 1001;
    private static int nextCandidateId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOnline Voting System Menu:");
            System.out.println("1. Register Voter");
            System.out.println("2. Add Candidate");
            System.out.println("3. Start Voting");
            System.out.println("4. Cast Vote");
            System.out.println("5. View Results");
            System.out.println("6. Exit");
            System.out.println("7. Stop Voting");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerVoter(scanner);
                    break;
                case 2:
                    addCandidate(scanner);
                    break;
                case 3:
                    startVoting();
                    break;
                case 4:
                    castVote(scanner);
                    break;
                case 5:
                    viewResults();
                    break;
                case 6:
                    System.out.println("Exiting the voting system. Goodbye!");
                    scanner.close();
                    return;
                case 7:
                    stopVoting();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerVoter(Scanner scanner) {
        System.out.print("Enter voter name: ");
        String voterName = scanner.nextLine();
        voters.put(nextVoterId++, voterName);
        System.out.println("Voter registered successfully with ID: " + (nextVoterId - 1));
    }

    private static void addCandidate(Scanner scanner) {
        System.out.print("Enter candidate name: ");
        String candidateName = scanner.nextLine();
        int currentId = nextCandidateId++;
        candidates.put(currentId, candidateName);
        votes.put(currentId, 0);
        System.out.println("Candidate added successfully with ID: " + currentId);
    }

    private static void startVoting() {
        if (candidates.isEmpty()) {
            System.out.println("No candidates added yet. Please add candidates before starting voting.");
            return;
        }
        votingOpen = true;
        System.out.println("Voting has started!");
        System.out.println("Available candidates:");
        for (Map.Entry<Integer, String> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    private static void stopVoting() {
        if (!votingOpen) {
            System.out.println("Voting is already closed.");
        } else {
            votingOpen = false;
            System.out.println("Voting has been closed.");
        }
    }

    private static void castVote(Scanner scanner) {
        if (!votingOpen) {
            System.out.println("Voting is not currently open.");
            return;
        }
        if (voters.isEmpty()) {
            System.out.println("No voters registered.");
            return;
        }
        if (candidates.isEmpty()) {
            System.out.println("No candidates available to vote for.");
            return;
        }

        System.out.print("Enter your Voter ID: ");
        int voterId = scanner.nextInt();
        scanner.nextLine();

        if (!voters.containsKey(voterId)) {
            System.out.println("Invalid Voter ID.");
            return;
        }

        System.out.print("Enter the ID of the candidate you want to vote for: ");
        int candidateId = scanner.nextInt();
        scanner.nextLine();

        if (!candidates.containsKey(candidateId)) {
            System.out.println("Invalid Candidate ID.");
            return;
        }

        votes.put(candidateId, votes.get(candidateId) + 1);
        System.out.println("Vote casted successfully for " + candidates.get(candidateId) + ".");
        voters.remove(voterId);
    }

    private static void viewResults() {
        if (votingOpen) {
            System.out.println("Voting is still open. Results will be available after voting closes.");
            return;
        }
        if (candidates.isEmpty()) {
            System.out.println("No candidates to display results for.");
            return;
        }

        System.out.println("\n--- Voting Results ---");
        if (votes.isEmpty()) {
            System.out.println("No votes have been cast yet.");
        } else {
            List<Map.Entry<Integer, Integer>> sortedVotes = new ArrayList<>(votes.entrySet());
            sortedVotes.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

            for (Map.Entry<Integer, Integer> entry : sortedVotes) {
                System.out.println(candidates.get(entry.getKey()) + ": " + entry.getValue() + " votes");
            }
        }
    }
}