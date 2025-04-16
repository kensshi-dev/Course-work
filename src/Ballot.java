
import java.util.*;

public class Ballot {
    private String name;
    List<Candidate> candidates = new ArrayList<>();

    public Ballot(String name) {
        this.name = name;
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return name + " - Candidates: " + candidates;
    }
}
