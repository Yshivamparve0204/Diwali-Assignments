import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student>students = new ArrayList<>();
        students.add(new Student(01,"shivam","java",80.00,85));
        students.add(new Student(02,"shivam","java",55.00,65));
        students.add(new Student(03,"shivam","java",65.00,87));
        students.add(new Student(04,"shivam","java",53.00,95));
        students.add(new Student(05,"shivam","java",87.00,85));
        students.add(new Student(06,"shivam","java",88.00,85));
        students.add(new Student(07,"shivam","java",45.00,85));
        students.add(new Student(8,"shivam","java",95.00,85));
        students.add(new Student(9,"shivam","java",67.00,85));
        students.add(new Student(10,"shivam","java",72.00,85));

        for(Student s: students){
            try{
               Student.calculateGrade(s);
            }catch(LowAttendanceException e){
                System.out.println(e.getMessage());
            }
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentData"))){
            oos.writeObject(students);
            System.out.println("data is saved successfullly in file");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Collections.sort(students);
        System.out.println("decrement order of attendace percent");
        for(Student s : students){
            System.out.println(s);
        }



    }
}
