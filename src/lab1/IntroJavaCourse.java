package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends CourseCatalog{

    private String prerequisites;

    public IntroJavaCourse(String prerequisites, String courseName, String courseNumber, double classCredits) {
        super(courseName, courseNumber, classCredits);
        this.prerequisites = prerequisites;
    }

     public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            System.out.println("Error: Prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }

    
    @Override
    public void generateClassInfo(){
        printClassName();
        printClassNumber();
        printClassCredits();
        printPrerequisites();
    }


    public void printPrerequisites(){
        System.out.println("Class Prerequisites: " + prerequisites);
    }    
}
