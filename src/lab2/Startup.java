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
        System.out.println("-------------------");
        
        IntroJavaCourse introJavaClass = new IntroJavaCourse();
 
        introJavaClass.setPrerequisites("Intro to Programming");
        introJavaClass.setCourseName("intro to java");
        introJavaClass.setCourseNumber("1234");
        introJavaClass.setClassCredits(3);

        introJavaClass.printClassInfo();
        
        System.out.println("-------------------");
         
        IntroToProgrammingCourse introProgramClass = new IntroToProgrammingCourse();
 
        introProgramClass.setCourseName("intro to programming");
        introProgramClass.setCourseNumber("0204");
        introProgramClass.setClassCredits(2);
        introProgramClass.printClassInfo(); 
    }
}
