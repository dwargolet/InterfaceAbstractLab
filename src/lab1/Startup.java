package lab1;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
        
        
       // CourseCatalog advancedJava = new AdvancedJavaCourse("",
       // "", "", 0);
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("",
        "", "", 0);
 
        advancedJava.setPrerequisites("Intro to Java");
        advancedJava.setCourseName("advanced java");
        advancedJava.setCourseNumber("7893");
        advancedJava.setClassCredits(4);

        advancedJava.generateClassInfo();
        
        
        
        
        
    }
}


/** using Liskov's method requires every property to be in the superclass
* if you have a property that is unique to a subclass, it wont run. It looks for the
* property in the subclass.  I don't believe that there is any real good time to 
* use this method as it seems to require you to assume no other subclasses will change
* or add something that the superclass doesn't include
* */