import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    String name;
    String register;
    Map<String,List<Double>> notes;

    Student(String name, String register){
        this.name = name;
        this.register = register;
        this.notes = new HashMap<>();

    }


}
