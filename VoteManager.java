
package model;

import java.util.*;
import java.util.logging.Logger;

public class VoteManager {
    private static final Logger logger = Logger.getLogger(VoteManager.class.getName());

    public Map<Integer, Voter> voters = new HashMap<>();
    public Map<Integer, Candidate> candidates = new HashMap<>();

    private boolean votingOpen = false;
    private int nextVoterId = 1001;
    private int nextCandidateId = 1;

    public int registerVoter(String name) {
        Voter v = new Voter(nextVoterId, name);
        voters.put(nextVoterId, v);
        logger.info("Voter registered: " + name + " (ID: " + nextVoterId + ")");
        return nextVoterId++;
    }

    public int addCandidate(String name) {
        Candidate c = new Candidate(nextCandidateId, name);
        candidates.put(nextCandidateId, c);
        logger.info("Candidate added: " + name + " (ID: " + nextCandidateId + ")");
        return nextCandidateId++;
    }

    public void startVoting() {
        votingOpen = true;
        System.out.println("✅ Voting Started.");
    }

    public void stopVoting() {
        votingOpen = false;
        System.out.println("🛑 Voting Closed.");
    }

    public boolean isVotingOpen() {
        return votingOpen;
    }

    public boolean castVote(int voterId, int candidateId) {
        Voter voter = voters.get(voterId);
        Candidate candidate = candidates.get(candidateId);

        if (voter == null || candidate == null || voter.hasVoted()) {
            return false;
        }

        voter.vote();
        candidate.addVote();
        return true;
    }

    public void showResults() {
        List<Candidate> sorted = new ArrayList<>(candidates.values());
        sorted.sort((a, b) -> Integer.compare(b.getVotes(), a.getVotes()));
        System.out.println("📊 Voting Results:");
        for (Candidate c : sorted) {
            System.out.println(c.getName() + ": " + c.getVotes() + " votes");
        }
    }
}