/**
 * Write a description of class FullTimeStaff here.
 *
 * @author (Samrat Ghale)
 */

class FullTImeStaffHire extends StaffHire {
    //declaring the private variables
    private int workingHours;
    private int salary;
    private String StaffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //getter methods for the private variables
    public int getWorkingHours() {
        return workingHours;
    }

    public int getSalary() {
        return salary;
    }

    public String getStaffName() {
        return StaffName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean getJoined() {
        return joined;
    }
    //setter methods for required variables
    public void setSalary(int newSalary) {
            salary = newSalary;

    }

    public void setWorkHour(int newWorkHour) {
        workingHours = newWorkHour;

    }
    //method to hire a fulltime staff
    public void hireFullTimeStaff(String StaffName, String joiningDate, String qualification, String appointedBy) {
         if(joined==false){
            
        
            this.StaffName = StaffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;}
            
        else{
            System.out.println("staff already exists");
        

    }}
    //method to display the informations of the staffs
    public void displayFulltimeStaffs() {
        super.display();
        if (joined == true) {
            System.out.println("workingHours= " + workingHours);
            System.out.println("salary=" + salary);
            System.out.println("name=" + StaffName);
            System.out.println("joiningDate=" + joiningDate);
            System.out.println("qualification=" + qualification);
            System.out.println("appointedBy=" + appointedBy);
        } else {
            System.out.println("the staff has not joined");

        }
    }
    //overloaded constructor to create a instance of a class
    FullTImeStaffHire(int vacancyNumber, String Designation, String JobType, int salary, int workingHours) {

        super(vacancyNumber, Designation, JobType);
        this.salary= salary;
        this.workingHours= workingHours;
        StaffName = "";
        joiningDate = "";
        joined = false;

    
}}
