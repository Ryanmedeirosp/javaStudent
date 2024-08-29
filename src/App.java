import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        School school = new School();

        Student student = new Student("ryan", "123");
        Student student2 = new Student("pedro", "321");

        
        school.addStudent(student);
        school.addStudent(student2);


        school.registerNotes("123", "matematica", List.of(10.0, 8.6,6.1));
        school.registerNotes("321", "matematica", List.of(8.0, 7.5,6.1));


        school.calculateAvarege("123", "matematica");
        school.calculateAvarege("321", "matematica");



        school.listAllStudents();
    }
}
