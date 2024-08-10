package CodSoft;
import java.util.Scanner;

public class Task_2 {
    public static void grade(int average){
        if (average >= 90 && average <= 100) {
            System.out.println("Grade: A");
        } else if (average >= 80 && average < 90) {
            System.out.println("Grade: B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Grade: C");
        } else if (average >= 60 && average < 70) {
            System.out.println("Grade: D");
        } else if (average < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid average score.");
        }
    }
    public static void averageCalculator(int sum,int count){
        if (count == 0) {
            System.out.println("No marks entered.");
            return;
        }
        int average =sum/count;
        System.out.println("Average of marks is "+average);
        grade(average);
        // return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chr = "Y";
        int count = 0;
        int sum = 0;

        while (chr.equalsIgnoreCase("Y")) {
            System.out.print("Enter the marks out of 100: ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.err.println();
                System.out.println("Please enter marks between 0 and 100.");
                continue;
            }
            sum += marks;
            count++;
            System.out.print("Press Y to enter more subject marks or any other key to exit: ");
            chr = sc.next();
            
        }
        
        System.out.println("\nTotal Marks Obtained "+sum);
        averageCalculator(sum,count);
        sc.close();
    }
}
