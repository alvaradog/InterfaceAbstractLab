
package lab2;

public class StartUp {
    
    /**
     * Liskov Substitution principle is used in the print line
     * where it goes through the array of classes and prints out
     * the name and credit amount
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
        
        programming101.setCredits(4);
        java101.setCredits(5);
        java102.setCredits(6);
        
        Course [] itClasses = {programming101, java101, java102};
        
        System.out.println("These are the programming courses available:");
        for (Course a : itClasses){
            System.out.print(a.getCourseName()+": "+a.getCredits()+" Credits\n");
        }
        
    }
}
