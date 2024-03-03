package projectds;
import java.util.Scanner;
/**
 * @author raob_ Rahaf Ali Alobaidi - 2006748
 */
class ProjectDS {
    public static void main(String[] args) {
        int choice;
        EmployeeRecordManagement list = new EmployeeRecordManagement();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Insert employee record "); 
            System.out.println("2. Show details of an employee");
            System.out.println("3. Search an employee");
            System.out.println("4. Update Salary of an employee:");
            System.out.println("5. Delete employee Record"); 
            System.out.println("6. Update employee Record");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    list.InsertDataEmployee();
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id1= sc.nextInt();
                    list.showDetails(id1);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();
                    if (list.searchRecord(searchId)) {
                        System.out.println("Record found.");
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter Work hours: ");
                    int updateWorkHours = sc.nextInt();
                    if (list.updateSalary(updateId, updateWorkHours) == -1) {
                        System.out.println("Record not found.");
                    } else {
                        System.out.println("Salary updated successfully.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();
                    //if the method returns -1, it means that the record was not found in the list
                    if (list.deleteRecord(deleteId) == -1) {
                        System.out.println("Record not found.");
                    } else {
                        System.out.println("Record deleted successfully.");
                    }
                    break;
                    
                case 6:
                    System.out.println("Enter ID Employee that you want to update: ");
                    int updatedID = sc.nextInt();
                    boolean check_update;
                    check_update = list.checkRecord(updatedID);
                    if (check_update ==false) {
                        System.out.println("No employee has this ID number:..." + updatedID);
                    } else {
                            list.updateEmployeeRecord(updatedID);
                    }
                    break;
                default:
                    System.out.println("Exiting the program...");
                    System.out.println("Invalid option. Please try again.");
            }
        }while(choice!=7);
        
        }
}