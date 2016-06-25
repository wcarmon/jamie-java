import java.util.Arrays;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        String shouldIRunAgain;
        do {
            runProgram();

            System.out.println("Should we run again? (Y or N)");
            Scanner scanner = new Scanner(System.in);
            shouldIRunAgain = scanner.next();
        }
        while (shouldIRunAgain.equals("Y"));
    }

    public static String[] getGradesAndStudents(int numberOfStudents) {
        String[] gradesAndStudents = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("[Student #" + i + "]: Enter the grade, followed by the student name (eg. 75 - Jenny)");
            gradesAndStudents[i] = scanner.nextLine();
        }
        return gradesAndStudents;
    }

    public static int getNumberOfStudents() {
        System.out.println("Enter the number of students:");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printInReverse(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = arr.length - i - 1;
            System.out.println(arr[index]);
        }
    }

    public static void runProgram() {
        int numberOfStudents = getNumberOfStudents();
        String[] gradesAndStudents = getGradesAndStudents(numberOfStudents);
        Arrays.sort(gradesAndStudents);

        System.out.println(numberOfStudents + "-Students sorted by descending grade:");
        printInReverse(gradesAndStudents);
        System.out.println("");
    }
}
