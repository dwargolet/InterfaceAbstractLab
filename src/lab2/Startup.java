package lab2;

/**
 *
 * @author dworgolet
 */
public class Startup {
    public static void main(String[] args) {
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse();
 
        advancedJava.setPrerequisites("Intro to Java");
        advancedJava.setCourseName("advanced java");
        advancedJava.setCourseNumber("7893");
        advancedJava.setClassCredits(4);
        advancedJava.printClassInfo();
        
        IntroJavaCourse introJavaClass = new IntroJavaCourse();
 
        introJavaClass.setPrerequisites("Intro to Programming");
        introJavaClass.setCourseName("intro to java");
        introJavaClass.setCourseNumber("1234");
        introJavaClass.setClassCredits(3);

        introJavaClass.printClassInfo();
         
        IntroToProgrammingCourse introProgramClass = new IntroToProgrammingCourse();
 
        introProgramClass.setCourseName("intro to programming");
        introProgramClass.setCourseNumber("0204");
        introProgramClass.setClassCredits(2);
        introProgramClass.printClassInfo(); 
    }
}

/* Using interfaces I find to be a bit more work in the sense that you must override
every method, where as with abstract superclasses you inherit whatever is in that class.
While I'd consider that a bad, the other side of the coin is the good.  By overriding
every method for each class that is using the interface, you have control over what
exactly it does.  I would say this limits the chance of getting poor code or things you
dont actually need.

From my understanding, the Liskov substitution principle could possibly work with
the "intro to programming" class as it doesn't have any unique properties.  Switching
any of the objects from this class with the "CourseCatalog" class, would likely still
result in a working program.  However, for "advanced" and "intro to java" both have
prerequesits properties, unique to their respective classes.  While Liskov's property 
may also work for these two classes specificly, they could not trade places with the interface
class, on account of the unique property they share.

This principle seems to run off the same foundation of basic inheritance. A dog is
an animal, there for as long as no unique properties or methods are with in dog, calling either
class should end in the same result.

*/