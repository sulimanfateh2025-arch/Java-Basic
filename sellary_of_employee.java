import java.util.Scanner;

public class sellary_of_employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int numberofemployees = sc.nextInt();
        int x;
        String[][] employees = new String[numberofemployees][x];
        for (int i = 0; i < numberofemployees; i++) {
            System.out.println("Enter employee information: ");
            int information = sc.nextInt();
            for (int j = 0; j < employees[x]; j++) {
                if (j == 0) {
                    System.out.println("Enter employee ID: ");
                } else if (j == 1) {
                    System.out.println("Enter employee name: ");
                } else if (j == 2) {
                    System.out.println("Enter employee position: ");
                } else System.out.println("Enter employee salary: ");
                employees[i][j] = sc.nextLine();


            }
        }
    }
}
