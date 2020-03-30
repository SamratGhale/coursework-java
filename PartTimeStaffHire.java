/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Samrat Ghale)
 */
//import javax.swing.JOptionPane;
class PartTimeStaffHire extends StaffHire {
    // declaring private variables
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    // getter methods for private variables

    public int getWorkingHours() {
        return workingHour;
    }

    public int getWagesPerHour() {
        return wagesPerHour;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getShifts() {
        return shifts;
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

    public String getJoiningDate() {
        return joiningDate;
    }

    public boolean getTerminated() {
        return terminated;
    }

    // method to set new shift
    public void setWorkingShift(String newShift) {
        if (joined == false) {
            this.shifts = newShift;
        } else {
            System.out.println("cannot create new shifts");
        }

    }

    // method to to terminate the staff
    public void terminateStaff() {
        if (terminated == true) {
            System.out.println("the staff is already terminated");
        } else {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
            System.out.println("the staff has been terminated");

        }

    }

    // method to hire the staff
    public void hirePartTimeStaff(String StaffName, String joiningDate, String qualification, String appointedBy) {
        if (joined == false) {
            this.staffName = StaffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;

            this.joined = true;
        } else {
                //JOptionPane.showMessageDialog(null, "Staff is already hired in the is vacancy");
            //System.out.println("staff is already hired");
        }
    }

    // method to display customers
    public void displayPartTimeStaff() {
        super.display();
        if (joined == true) { //checking if the staff has already joined
            System.out.println("name=" + staffName);
            System.out.println("joiningDate=" + joiningDate);
            System.out.println("qualification=" + qualification);
            System.out.println("appointedBy=" + appointedBy);
            System.out.println("wagesPerHour=" + wagesPerHour);
            System.out.println("workingHour="+workingHour);
            System.out.println("salary=" + wagesPerHour * workingHour);
        } else {
            System.out.println("staff has not joined");
        }
    }

    // overloaded constructor to create a instance of a class
    PartTimeStaffHire(int vacancyNumber, String Designation, int wagesPerHour, String JobType, int workingHour,
            String shifts) {

        super(vacancyNumber, Designation, JobType);// calling super constructor
        this.shifts= shifts;
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        this.wagesPerHour = wagesPerHour;
        this.workingHour = workingHour;
        terminated = false;
        this.joined = false;

    }
}