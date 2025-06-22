
public class MVCTest {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Aliya Yasmeen", "S101", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Initial Display
        controller.updateView();

        // Update student data
        controller.setStudentName("Aliya Y.");
        controller.setStudentGrade("A+");

        // Updated Display
        controller.updateView();
    }
}
