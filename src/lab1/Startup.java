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

        advancedJava.printClassInfo();
        System.out.println("-------------------");
        IntroJavaCourse introJavaClass = new IntroJavaCourse("",
        "", "", 0);
 
        introJavaClass.setPrerequisites("Intro to Programming");
        introJavaClass.setCourseName("intro to java");
        introJavaClass.setCourseNumber("1234");
        introJavaClass.setClassCredits(3);

        introJavaClass.printClassInfo();
        
         System.out.println("-------------------");
         
        IntroToProgrammingCourse introProgramClass = new IntroToProgrammingCourse("", 
                "", 0);
 
        introProgramClass.setCourseName("intro to programming");
        introProgramClass.setCourseNumber("0204");
        introProgramClass.setClassCredits(2);

        introProgramClass.printClassInfo();
        
    }
}

/** I personally prefer abstract classes over interfaces.  I feel that by creating
 * classes that extend another class you end up doing less overriding. Where it is
 * possible that even with interfaces this can be done, by extending a class that
 * utilizes the interface, you are still overriding every method from an interface.
 * Abstract classes, depending on the type of class may not require you to override a method
 * Of course a downfall of both is that if at any point a class needs another property or method
 * added, it affects every class that extends or implements this specific class.
 * However, the affect of this can be lessened by breaking up into multiple classes
 * 
 */



/** using Liskov's method requires every property to be in the superclass
* if you have a property that is unique to a subclass, it wont run. It looks for the
* property in the subclass.  I don't believe that there is any real good time to 
* use this method as it seems to require you to assume no other subclasses will change
* or add something that the superclass doesn't include
* */