package lab1;

/**
 * Extends the super class as well as has it's own unique property, overrides
 * the "generateClassInfo" method as it adds the prerequisites to it
 *
 * @author      Daniel Wargolet
 * @version     1.00
 */
public class IntroJavaCourse extends CourseCatalog{

    private String prerequisites;

    public IntroJavaCourse(String prerequisites, String courseName, String courseNumber, double classCredits) {
//        super(courseName, courseNumber, classCredits);
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
