package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Daniel Wargolet
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseCatalog{
    
    private String prerequisites;

    public AdvancedJavaCourse(String prerequisites, String courseName, String courseNumber, double classCredits) {
        super(courseName, courseNumber, classCredits);
        this.prerequisites = prerequisites;
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
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

    
}
