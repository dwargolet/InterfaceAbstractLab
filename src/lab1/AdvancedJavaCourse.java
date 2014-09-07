package lab1;

import javax.swing.JOptionPane;

/**
 * AdvancedJava extends the course catalog, using all of the same fields with the
 * specific property of "prerequisites" as not all classes have one. It also
 * override the "generateClassInfo" to include the prerequisite in the "printClassInfo"
 *
 * @author      Daniel Wargolet
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseCatalog{
    
    private String prerequisites;

    public AdvancedJavaCourse(String prerequisites, String courseName, String courseNumber, double classCredits) {
//        super(courseName, courseNumber, classCredits);
        this.prerequisites = prerequisites;
    }    
    

    public String getPrerequisites() {
        return prerequisites;
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
           JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

   
    private void generateClassInfo(){
        printClassName();
        printClassNumber();
        printClassCredits();
        printPrerequisites();
        System.out.println("-------------------");
    }
    
    
    private void printPrerequisites(){
        System.out.println("Class Prerequisites: " + prerequisites);
    }
}
