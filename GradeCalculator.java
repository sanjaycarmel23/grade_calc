

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalSubjects;
        double totalMarks = 0, averagePercentage;
        
        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();
        
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            
            // Validating marks between 0 and 100
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                i--; // Decrementing i to re-enter marks for the same subject
            } else {
                totalMarks += marks;
            }
        }
        
        // Calculating average percentage
        averagePercentage = totalMarks / totalSubjects;
        
        // Displaying total marks and average percentage
        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        // Assigning grades based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Displaying the corresponding grade
        System.out.println("Your Grade: " + grade);
        
        scanner.close();
    }
}
