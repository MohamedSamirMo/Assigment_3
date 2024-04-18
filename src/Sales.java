import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of employees
        System.out.print("Enter number of Employees: ");
        int numEmployees = scanner.nextInt();
        // Array to store the counts for each salary range
        int[] salaryRanges = new int[9]; // Each index corresponds to a salary range
        // Loop to input gross sales for each employee and calculate their salary
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter Employee gross sale: ");
            double grossSales = scanner.nextDouble();
            // Calculate salary for the current employee
            int salary = (int) (200 + 0.09 * grossSales);
            // Update count for the corresponding salary range
            if (salary >= 200 && salary <= 299) {
                salaryRanges[0]++;
            } else if (salary >= 300 && salary <= 399) {
                salaryRanges[1]++;
            } else if (salary >= 400 && salary <= 499) {
                salaryRanges[2]++;
            } else if (salary >= 500 && salary <= 599) {
                salaryRanges[3]++;
            } else if (salary >= 600 && salary <= 699) {
                salaryRanges[4]++;
            } else if (salary >= 700 && salary <= 799) {
                salaryRanges[5]++;
            } else if (salary >= 800 && salary <= 899) {
                salaryRanges[6]++;
            } else if (salary >= 900 && salary <= 999) {
                salaryRanges[7]++;
            } else {
                salaryRanges[8]++; // For salaries over 1000
            }
            // Print the salary of the current employee
            System.out.println("Employee salary is $" + salary);
        }
        // Output the total number of employees reported
        System.out.println("Total " + numEmployees + " Employees Reported");
        // Output the count of employees in each salary range
        int rangeName=2;
        for (int range:salaryRanges){
            if (rangeName<10){
            System.out.println(rangeName+"00 - "+rangeName+"99 : "+range);
            rangeName++;
        }else {
                System.out.println( "Over 1000 : "+range);
            }
        }
    }
    }

