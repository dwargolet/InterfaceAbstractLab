package lab2;

import javax.swing.JOptionPane;

/**
 * Is essentially the same class as AdvancedJava, though Intro to Java
 * is not a "advanced java course" so I decided against extending it
 * the code is the same as everything inside "advanced java".  Which leads me
 * to believe there may be a better way of writing this class, or perhaps im 
 * misunderstanding the relationship this class would have with the "advanced java"
 *
 * @author      Daniel Wargolet
 * @version     1.00
 */
public class IntroJavaCourse implements CourseCatalog{
    private String courseName;
    private String courseNumber;
    private double classCredits;
    private String prerequisites;

    
     public String getPrerequisites(){
        return prerequisites;
    }
    
    public void setPrerequisites(String prerequisites){
        if(prerequisites == null || prerequisites.length() == 0) {
           JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    public void printPrerequisites(){
        System.out.println("Class Prerequisites: " + prerequisites);
    }
    
    
    @Override
    public String getCourseName(){
        return courseName;
    }
    
    @Override
    public void setCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                "Error: courseName cannot be null of empty string");
            System.exit(0);
        }   
        this.courseName = courseName;
    }
    
    @Override
    public String getCourseNumber(){
        return courseNumber;
    }
    
    @Override
    public void setCourseNumber(String courseNumber){
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                "Error: Course number cannot be null of empty string");
            System.exit(0);    
        }
        this.courseNumber = courseNumber;
    }   
    
    @Override
    public double getClassCredits(){
        return classCredits;
    }
    
    @Override
    public void setClassCredits(double classCredits){
        if(classCredits < 0.5 || classCredits > 4.0) {
            JOptionPane.showMessageDialog(null,
                "Error: Credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.classCredits = classCredits;
    }
    
    @Override
    public void printClassName(){
        System.out.println("Course Name: " + courseName.toUpperCase());
    }
    
    @Override
    public void printClassNumber(){
        System.out.println("Course Number: " + courseNumber);
    }
    
    @Override
    public void printClassCredits(){
        System.out.println("Class Credits: " + classCredits);
    };
    
    @Override
    public void generateClassInfo(){
        printClassName();
        printClassNumber();
        printClassCredits();
        printPrerequisites();
        System.out.println("-------------------");
    }
    
    @Override
    public void printClassInfo(){
        generateClassInfo();
    }
    
}
