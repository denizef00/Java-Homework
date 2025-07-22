public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        sm.addStudent("001", new Student("1","Ali" ));
        sm.addStudent("001", new Student("2", "Veli")); // DuplicateStudentException


        sm.removeStudent("005"); // StudentNotFoundException

    }
}