
import java.io.*;
import java.util.*;

public class FileHandler {
    private static final String FILE = "data/ballots.txt";
    private static final String LOG = "logs/activity.log";

    public static List<Ballot> loadBallots() {
        List<Ballot> ballots = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            Ballot ballot = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Ballot:")) {
                    ballot = new Ballot(line.substring(7));
                    ballots.add(ballot);
                } else if (ballot != null && !line.isEmpty()) {
                    ballot.addCandidate(new Candidate(line));
                }
            }
        } catch (IOException e) {
            System.out.println("No saved ballots found.");
        }
        return ballots;
    }

    public static void saveBallots(List<Ballot> ballots) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))) {
            for (Ballot b : ballots) {
                bw.write("Ballot:" + b.getName());
                bw.newLine();
                for (Candidate c : b.candidates) {
                    bw.write(c.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error saving ballots.");
        }
    }

    public static void log(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG, true))) {
            bw.write(new Date() + " - " + message);
            bw.newLine();
        } catch (IOException ignored) {}
    }
}
