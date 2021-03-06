import java.util.Scanner;
 
public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int lowMax = Integer.parseInt(scanner.nextLine());
        int low = 0;
        int counter = 0;
        int total = 0;
        String name = "";
 
        while (low < lowMax) {
            String in = scanner.nextLine();
            if (!in.equals("Enough")) {
                name = in;
                int grade = Integer.parseInt(scanner.nextLine());
                total += grade;
                if (grade <= 4)
                    low++;
                counter++;
            } else {
                break;
            }
        }
        if (low == lowMax) {
            System.out.printf("You need a break, %d poor grades.", low);
        } else {
            System.out.printf("Average score: %.2f%n", total / (double) counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.println("Last problem: " + name);
        }
    }
}