import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private final List<Student> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudent(String name, String group, double score) {
        Student student = new Student();
        student.setId(nextId++);
        student.setName(name);
        student.setGroup(group);
        student.setScore(score);
        student.setActive(true);

        students.add(student);
    }

    public void removeStudent(Integer id) {
        students.removeIf(student -> student.getId().equals(id));
    }


    public Student findById(Integer id) {

        for(Student student : students ){
            if(student.getId().equals(id)){
                return student;
            }
        }

        return  null;


    }


    public void updateStudent(Integer id, String newName, String newGroup, double newScore){

        Student student = findById(id);

        if(student == null) {
            System.out.println("Student not found !");
            return;
        }

        student.setName(newName);
        student.setGroup(newGroup);
        student.setScore(newScore);


    }

    public void deactiveStudent(Integer id){
        Student student = findById(id);

        if(student == null){
            System.out.println("Student not found !");
            return;
        }

        student.setActive(false);
    }


    public List<Student> search(String keyword) {

        List<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    student.getGroup().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(student);
            }
        }

        return result;
    }


    public void showAll(){

        if(students.isEmpty()){
            System.out.println("There are no students");
            return;
        }

        for(Student student : students){
            System.out.println(student);
        }


    }


    public void clearAll(){
        if (students.isEmpty()){
            System.out.println("There are no students");
            return;
        }

        students.clear();
        System.out.println("The entire student list has been deleted.");


    }






}
