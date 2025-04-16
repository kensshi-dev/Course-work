
import java.util.*;

public class BallotManager {
    private List<Ballot> ballots = new ArrayList<>();

    public void loadData() {
        ballots = FileHandler.loadBallots();
    }

    public void saveData() {
        FileHandler.saveBallots(ballots);
    }

    public void addBallot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ballot name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Ballot name cannot be empty.");
            return;
        }

        Ballot ballot = new Ballot(name);
        while (true) {
            System.out.print("Add candidate (or 'done'): ");
            String candidate = scanner.nextLine().trim();
            if (candidate.equalsIgnoreCase("done")) break;
            if (!candidate.isEmpty()) {
                ballot.addCandidate(new Candidate(candidate));
            }
        }
        ballots.add(ballot);
        FileHandler.log("Added ballot: " + name);
    }

    public void viewBallots() {
        if (ballots.isEmpty()) {
            System.out.println("No ballots available.");
            return;
        }
        for (int i = 0; i < ballots.size(); i++) {
            System.out.println((i + 1) + ". " + ballots.get(i));
        }
    }

    public void updateBallot() {
        viewBallots();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ballot number to update: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < ballots.size()) {
            Ballot ballot = ballots.get(index);
            System.out.print("New ballot name (leave empty to keep current): ");
            String newName = scanner.nextLine();
            if (!newName.trim().isEmpty()) ballot.setName(newName);
            FileHandler.log("Updated ballot: " + newName);
        } else {
            System.out.println("Invalid ballot index.");
        }
    }

    public void deleteBallot() {
        viewBallots();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ballot number to delete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < ballots.size()) {
            String name = ballots.get(index).getName();
            ballots.remove(index);
            FileHandler.log("Deleted ballot: " + name);
        } else {
            System.out.println("Invalid ballot index.");
        }
    }
}
