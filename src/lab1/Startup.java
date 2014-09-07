package lab1;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
        
        
      
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("",
        "", "", 0);
 
        advancedJava.setPrerequisites("Intro to Programming");
        advancedJava.setCourseName("advanced java");
        advancedJava.setCourseNumber("7893");
        advancedJava.setClassCredits(4);

        advancedJava.printClassInfo();
        
        IntroJavaCourse introJavaClass = new IntroJavaCourse("",
        "", "", 0);
 
        introJavaClass.setPrerequisites("Intro to Programming");
        introJavaClass.setCourseName("intro to java");
        introJavaClass.setCourseNumber("1234");
        introJavaClass.setClassCredits(3);

        introJavaClass.printClassInfo();
        
         
         
        CourseCatalog introProgramClass = new IntroToProgrammingCourse();
 
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
* property in the subclass.  I believe that there are only a few instances where
* using this method would be good to use.  The method seems to require you to 
* assume no other subclasses will change or add something that the superclass 
* doesn't include.  In my example, the Course catalog has minimal properties that
* the IntroToProgramming class shares, however if at anytime the CourseCatalog must
* add another property that IntroToProgramming doesn't have, the code will break.
* However I do personally believe that with this specific example, that it is unlikely
* anything added to the CourseCatalog would be excluded from IntroToProgramming.
* */