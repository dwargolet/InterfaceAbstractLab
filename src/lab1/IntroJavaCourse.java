package lab1;

import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    
 
    public void generateClassInfo(){
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
