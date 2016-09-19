
package lab1;

public class StartUp {
    
    /**
     * Good :
     * By including the superclass of Course, you are able to reuse code
     * that all classes use. Course name, number, credits. 
     * 
     * Bad:
     * I am not sure if the single responsibility principle used in the
     * instance where there is a check for prerequisites. I do not think
     * that its the task for the course, and that is a feature that many
     * more courses may have, but not all
     * 
     * @param args
     */
    
    
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
        
        System.out.println("These are programming courses available:\n" + 
                programming101.getCourseName()+": " 
                +programming101.getCredits() + " Credits\n"
                + java101.getCourseName() + ": "
        + java101.getCredits() + " Credits\n" 
                + java102.getCourseName() + ": "
        + java102.getCredits() + " Credits\n");
    }
}
