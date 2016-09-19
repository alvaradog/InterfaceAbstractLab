
package lab1;

public class StartUp {
    public static void main(String[] args) {
        
        Course programming101 = new IntroToProgrammingCourse("Intro to "
                + "Programming","P101");
        
        Course java101 = new IntroJavaCourse ("Intro to Java","J101","Intro"
                + " to Programming");
        
        Course java102 = new AdvancedJavaCourse("Advanced Java"
                + "","J102","Intro to Java");
        
        programming101.setCredits(3);
        java101.setCredits(4);
        java102.setCredits(4);
        
        System.out.println("These are programming courses available:");
    }
}
