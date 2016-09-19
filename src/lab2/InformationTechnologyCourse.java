
package lab2;

public abstract class InformationTechnologyCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        this.credits = credits;
    }
    
}
