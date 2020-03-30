/**
 * Write a description of class StaffHire c here.
 *
 * @author (Samrat Ghale)
 */
public class StaffHire {
    //declaring the private variables
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    //getters methods for private variable
   
    public int getVacancyNumber(){
        
        return vacancyNumber;
    }
    
    
    public String getDesignation(){
    
        return designation;
    }
    public String getJobType(){
        
        return jobType;
    }
    
    
    //overloaded constructor to create a instance of a class
    
    StaffHire(int vacancyNumber, String Designation, String JobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = Designation;
        this.jobType = JobType;

    }
    //method to display 
    public void display() {

        System.out.println("vacancy number: "+vacancyNumber);
        System.out.println("Designation:  "+designation);  
        System.out.println("jobType: "+jobType);

    }

   
}