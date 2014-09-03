package lab1;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
        
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("",
        "", "", 0);
 
        advancedJava.setPrerequisites("Intro to Java");
        advancedJava.setCourseName("advanced java");
        advancedJava.setCourseNumber("7893");
        advancedJava.setClassCredits(4);

        advancedJava.generateClassInfo();
    }
}
