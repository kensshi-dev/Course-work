
import java.io.*;

public class ReportGenerator {
    public static void generateReport() {
        System.out.println("--- Report ---");

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("data/ballots.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Ballot:")) count++;
            }
        } catch (IOException e) {
            System.out.println("Report error.");
        }

        System.out.println("Total ballots: " + count);

        System.out.println("Activity log:");
        try (BufferedReader br = new BufferedReader(new FileReader("logs/activity.log"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("No activity logs found.");
        }
    }
}
