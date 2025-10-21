 import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // used to read input from user
        int[] marks = new int[5]; // to store 5 subject marks
        int total = 0;

        // Step 1: Input marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i]; // add each mark to total
        }

        // Step 2: Calculate average
        double avg = total / 5.0; // divide total by number of subjects

        // Step 3: Display average and grade
        System.out.println("Average: " + avg);

        // Step 4: Assign grade using if-else
        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

