import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> listOfStudents;


    School(){
        this.listOfStudents = new ArrayList<Student>();
    }

    public void addStudent(Student student){

        listOfStudents.add(student);

    }

    public void registerNotes(String register, String matter, List<Double> notes){

        for (Student student : listOfStudents) {

            if (student.register.equals(register)) {

                student.notes.put(matter, notes);
                
            }
            
        }


    }

    public void calculateAvarege(String register, String matter){

        Double avarageNotes= 0.0;
        Double sumNotes= 0.0;


       for (Student student : listOfStudents) {

        if (student.register.equals(register)) {

           if(student.notes.containsKey(matter)){

            List<Double> notesList = student.notes.get(matter);

            for (Double double1 : notesList) {

                sumNotes += double1;
                
            }

            avarageNotes = sumNotes/ notesList.size();

           }

           
            
        }
       }

       System.out.println("A média da disciplina "+ matter + " é igual a: " + avarageNotes);
    }

    public void listAllStudents(){

        for (Student student : listOfStudents) {

            System.out.println(student.name);

        }
    }


}
