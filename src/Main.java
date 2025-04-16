
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BallotManager manager = new BallotManager();
        manager.loadData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Voting System ---");
            System.out.println("1. Add Ballot");
            System.out.println("2. View Ballots");
            System.out.println("3. Update Ballot");
            System.out.println("4. Delete Ballot");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> manager.addBallot();
                case "2" -> manager.viewBallots();
                case "3" -> manager.updateBallot();
                case "4" -> manager.deleteBallot();
                case "5" -> ReportGenerator.generateReport();
                case "6" -> {
                    manager.saveData();
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
