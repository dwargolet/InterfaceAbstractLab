package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public abstract class CourseCatalog {
    
    private String courseName = "";
    private String courseNumber = "";
    private double classCredits;

//    public CourseCatalog(String courseName, String courseNumber, double classCredits) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
//        this.classCredits = classCredits;
//    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    //left entire name to capialized as some reports use that format
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course number cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getClassCredits() {
        return classCredits;
    }

    private void generateClassInfo(){
        printClassName();
        printClassNumber();
        printClassCredits();    
    }
    
    public void printClassInfo(){
        generateClassInfo();
        System.out.println("-------------------");
    }
    
    public void setClassCredits(double classCredits){
        if(classCredits < 0.5 || classCredits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.classCredits = classCredits;
    }           
    
    public void printClassName(){
        System.out.println("Course Name: " + getCapitalizedCourseName());
    }
    
    public void printClassNumber(){
        System.out.println("Course Number: " + courseNumber);
    }
    
    public void printClassCredits(){
        System.out.println("Class Credits: " + classCredits);
    }
}
