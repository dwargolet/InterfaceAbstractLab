package lab2;

public interface CourseCatalog {
 
    
    public abstract String getCourseName();
    public abstract void setCourseName(String CourseName);   
    
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String CourseNumber);   
    
    public abstract String getClassCredits();
    public abstract void setClassCredits(double ClassCredits);   
    
    public abstract void generateClassInfo();
    
    public abstract void printClassName();
    public abstract void printClassNumber();
    public abstract void printClassCredits();
}