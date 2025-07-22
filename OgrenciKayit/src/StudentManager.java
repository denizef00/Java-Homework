import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String id,Student student)throws DuplicateStudentException {
        try {
            if(students.containsKey(id)){
                    throw new DuplicateStudentException("This student number already taken!!");
                }
            students.put(id, student);
        }catch (DuplicateStudentException e){
            System.out.println(e.getMessage());
        }
    }
    public void removeStudent(String id) throws StudentNotFoundException{
        try{
            if(!students.containsKey(id)){
                throw new StudentNotFoundException("Student Not Found!!");
            }
            students.remove(id);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Student getStudent(String id) throws StudentNotFoundException{
        try{
            if(!students.containsKey(id)){
                throw new StudentNotFoundException("Student not found!!");
            }
            return students.get(id);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

