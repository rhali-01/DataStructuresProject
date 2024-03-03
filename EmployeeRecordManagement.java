package projectds;
import java.util.Scanner;
/**
 * @author raob_ Rahaf Ali Alobaidi - 2006748 
 */
    public class EmployeeRecordManagement {
    
      EmpNode head=null;

       public boolean checkRecord(int id) {
        EmpNode current = head;
        while (current != null) {
            if (current.id == id) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void createRecord(String name, int id, String firstDayOfWork, String phoneNumber, String address, int salary){
  
        if (!checkRecord(id)) {
            EmpNode newEmployee = new EmpNode(name, id, firstDayOfWork, phoneNumber, address, salary);
         // SORTED LIST 
            if (head == null || head.id >= newEmployee.id) {
                newEmployee.next = head;
                head = newEmployee;
            } else {
                EmpNode temp = head;
                while (temp.next != null && temp.next.id < newEmployee.id) {
                    temp = temp.next;
                }
                newEmployee.next = temp.next;
                temp.next = newEmployee;
            }
            System.out.println("The employee has been added successfully...");
        } else {
            System.out.print("Error: Employee with ID " + id + " already exists in the database.");

        }
    }
    
    public void InsertDataEmployee() {
        System.out.println("Enter employee information: ");
        System.out.print("Enter Name: "); 
        Scanner scname = new Scanner(System.in);
        String name = scname.nextLine();
        System.out.print("Enter ID: ");
        Scanner scid = new Scanner(System.in);
        int id = scid.nextInt();
        System.out.print("Enter First day of work: ");
        Scanner scFDW = new Scanner(System.in);
        String firstDayOfWork = scFDW.next();
        System.out.print("Enter Phone number: ");
        Scanner scPHO = new Scanner(System.in);
        String phoneNumber = scPHO.nextLine();
        System.out.print("Enter Address: ");
        Scanner scAD = new Scanner(System.in);
        String address = scAD.next();
        System.out.print("Enter Salary: ");
        Scanner salarysc = new Scanner(System.in);
        int Salary = salarysc.nextInt();
        createRecord(name, id, firstDayOfWork, phoneNumber, address , Salary);
}

    public int deleteRecord(int id) {
        EmpNode current = head;
        EmpNode prev = null;
        while (current != null) {
            if (current.id == id) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                return 0;
            }
            prev = current;
            current = current.next;
        }
        return -1;
    }
    public int updateRecord(int id, String name, String firstDayOfWork, String phoneNumber, String address, int workHours, int salary) {
        EmpNode current = head;
        while (current != null) {
            if (current.id == id) {
                current.name = name;
                current.firstDayOfWork = firstDayOfWork;
                current.phoneNumber = phoneNumber;
                current.address = address;
                current.workHours = workHours;
                current.salary = salary;
                return 0;
            }
            current = current.next;
        }
        return -1;
    }

    public void showDetails(int id) {
        EmpNode current = head;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Name: " + current.name);
                System.out.println("ID: " + current.id);
                System.out.println("First day of work: " + current.firstDayOfWork);
                System.out.println("Phone number: " + current.phoneNumber);
                System.out.println("Address: " + current.address);
                System.out.println("Work hours: " + current.workHours);
                System.out.println("Salary: " + current.salary);
                return;
            }
            current = current.next;
        }
        System.out.println("Error: Employee with ID " + id + " not found in the database.");
    }
    public boolean searchRecord(int id) {
        EmpNode current = head;
        while (current != null) {
            if (current.id == id) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int updateSalary(int id, int workHours) {
        EmpNode current = head;
        while (current != null) {
            if (current.id == id) {
                if (workHours > 32) {
                    int extraHours = workHours - 32;
                    int extraSalary = (int)(current.salary * 0.02 * extraHours); 
                    current.salary += extraSalary;
                }
                return 0;
            }
            current = current.next;
        }
        return -1;
    }

void updateEmployeeRecord(int ID)
 {
        Scanner input = new Scanner(System.in);
        EmpNode temp = head;

        if (temp == null) 
        {
            System.out.println("Sorry this list dont have any records");
            return;
        }

        while (temp != null) {
            if (temp.id == ID) {
                System.out.println("1- EMPLOYEE PHONE NUMBER ");
                System.out.println("2- EMPLOYEE ADDRESS ");
                System.out.println("3- EMPLOYEE SALARY ");
                System.out.println("4- EMPLOYEE NAME ");
                int num = input.nextInt();

                switch (num)
                {
                    case 1:
                        System.out.println("THE NEW PHOEN NUMBER : ");
                        String NEWNUM = input.next();
                        temp.phoneNumber = NEWNUM;
                        break;
                    case 2:
                        System.out.println("THE NEW ADDRESS : ");
                        String NEWADD = input.next();
                        temp.address = NEWADD;
                        break;
                    case 3:
                        System.out.println("THE NEW SALARY : ");
                        double NEWSAL = input.nextDouble();
                        temp.salary = NEWSAL;
                        break;
                    case 4:
                        System.out.println("THE NEW NAME : ");
                        String NEWH = input.next();
                        temp.name = NEWH;
                        break;
                    default:
                        System.out.println("PLEASE ENTER CORRECT CHOOICE");
                        updateEmployeeRecord(ID);
                        break;
                }
                return;
            }
            temp = temp.next;
        }
    }
}
