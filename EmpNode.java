package projectds;
/**
 * @author raob_ Rahaf Ali Alobaidi - 2006748 
 */
public class EmpNode {

    public String name;
    public int id;
    public String firstDayOfWork;
    public String phoneNumber;
    public String address;
    public int workHours = 32;
    public double salary;
    public EmpNode next;

    public EmpNode(String EmployeeName, int id, String firstDayOfWork, String phoneNumber, String address, double salary) {
        this.name = EmployeeName;
        this.id = id;
        this.firstDayOfWork = firstDayOfWork;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.workHours=32;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getfirstDayOfWork() {
        return firstDayOfWork;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkHours() {
        return workHours;
    }

    public double getSalary() {
        return salary;
    }

    public EmpNode getNext() {
        return next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstDayOfWork(String firstDayOfWork) {
        this.firstDayOfWork = firstDayOfWork;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNext(EmpNode next) {
        this.next = next;
    }
         
}
